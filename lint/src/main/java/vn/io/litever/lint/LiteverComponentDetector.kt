package vn.io.litever.lint

import com.android.tools.lint.client.api.UElementHandler
import com.android.tools.lint.detector.api.*
import org.jetbrains.uast.UCallExpression
import org.jetbrains.uast.UElement

@Suppress("UnstableApiUsage")
class LiteverComponentDetector : Detector(), Detector.UastScanner {

    override fun getApplicableUastTypes(): List<Class<out UElement>> {
        return listOf(UCallExpression::class.java)
    }

    override fun createUastHandler(context: JavaContext): UElementHandler {
        return object : UElementHandler() {
            override fun visitCallExpression(node: UCallExpression) {
                val methodName = node.methodName ?: return
                
                // Only care if it's one of the components we want to replace
                if (!COMPONENT_MAP.containsKey(methodName)) return

                val resolvedMethod = node.resolve() ?: return
                val packageName = context.evaluator.getPackage(resolvedMethod)?.qualifiedName ?: return

                // Only flag if it comes from the Material 3 library
                if (packageName == "androidx.compose.material3") {
                    val replacement = COMPONENT_MAP[methodName] ?: return
                    
                    // Create the quick fix
                    val fix = fix()
                        .name("Replace with $replacement")
                        .replace()
                        .text(methodName)
                        .with(replacement)
                        // Add import for the new component
                        .imports("vn.io.litever.designsystem.components.$replacement")
                        .build()

                    context.report(
                        ISSUE,
                        node,
                        context.getLocation(node),
                        "Use $replacement instead of Material 3 $methodName to maintain Litever Design System consistency.",
                        fix
                    )
                }
            }
        }
    }

    companion object {
        val COMPONENT_MAP = mapOf(
            "Button" to "LiteverButton",
            "TextButton" to "LiteverTextButton",
            "OutlinedButton" to "LiteverOutlinedButton",
            "IconButton" to "LiteverIconButton",
            "FilledIconButton" to "LiteverFilledIconButton",
            "FilledTonalIconButton" to "LiteverFilledTonalIconButton",
            "OutlinedIconButton" to "LiteverOutlinedIconButton",
            "TextField" to "LiteverTextField",
            "Card" to "LiteverCard",
            "ElevatedCard" to "LiteverElevatedCard",
            "OutlinedCard" to "LiteverOutlinedCard",
            "Checkbox" to "LiteverCheckbox",
            "RadioButton" to "LiteverRadioButton",
            "Badge" to "LiteverBadge",
            "BadgedBox" to "LiteverBadgedBox",
            "HorizontalDivider" to "LiteverHorizontalDivider",
            "VerticalDivider" to "LiteverVerticalDivider",
            "Snackbar" to "LiteverSnackbar",
            "SnackbarHost" to "LiteverSnackbarHost",
            "ModalBottomSheet" to "LiteverModalBottomSheet",
            "FilterChip" to "LiteverFilterChip",
            "SuggestionChip" to "LiteverSuggestionChip",
            "InputChip" to "LiteverInputChip",
            "AssistChip" to "LiteverAssistChip",
            "TopAppBar" to "LiteverTopAppBar",
            "AlertDialog" to "LiteverAlertDialog",
            "DatePickerDialog" to "LiteverDatePickerDialog",
            "FloatingActionButton" to "LiteverFloatingActionButton",
            "ListItem" to "LiteverListItem",
            "ModalNavigationDrawer" to "LiteverNavigationDrawer",
            "NavigationDrawerItem" to "LiteverNavigationDrawerItem",
            "CircularProgressIndicator" to "LiteverCircularProgressIndicator",
            "LinearProgressIndicator" to "LiteverLinearProgressIndicator",
            "Scaffold" to "LiteverScaffold",
            "SingleChoiceSegmentedButtonRow" to "LiteverSingleChoiceSegmentedButtonRow",
            "Switch" to "LiteverSwitch"
        )

        val ISSUE = Issue.create(
            id = "LiteverComponentUsage",
            briefDescription = "Use Litever Design System components",
            explanation = "To maintain consistency with the Litever Design System, you should use Litever components instead of default Material 3 components.",
            category = Category.CORRECTNESS,
            priority = 7,
            severity = Severity.WARNING,
            implementation = Implementation(
                LiteverComponentDetector::class.java,
                Scope.JAVA_FILE_SCOPE
            )
        )
    }
}
