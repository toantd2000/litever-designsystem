package vn.io.litever.lint

import com.android.tools.lint.client.api.IssueRegistry
import com.android.tools.lint.client.api.Vendor
import com.android.tools.lint.detector.api.CURRENT_API

@Suppress("UnstableApiUsage")
class LiteverIssueRegistry : IssueRegistry() {
    override val issues = listOf(
        LiteverComponentDetector.ISSUE
    )

    override val api: Int
        get() = CURRENT_API

    override val vendor: Vendor
        get() = Vendor(
            vendorName = "Litever",
            identifier = "vn.io.litever:lint",
            feedbackUrl = "https://github.com/toantd2000/litever-designsystem/issues"
        )
}
