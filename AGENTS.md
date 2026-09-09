# Git Commit Message Conventions

When performing git commits, the agent MUST always follow the Conventional Commits specification.
All commit messages MUST be written in English.

## Format
```
<type>(<optional scope>): <short description in imperative mood>

[optional body explaining what and why]

[optional footer(s), e.g., BREAKING CHANGE: ...]
```

## Allowed Types
- `feat`: A new feature
- `fix`: A bug fix
- `refactor`: Code changes that neither fix a bug nor add a feature
- `chore`: Changes to build process, tooling, auxiliary tools, dependencies, or maintenance tasks
- `docs`: Documentation only changes
- `style`: Changes that do not affect the meaning of the code (formatting, white-space, etc.)
- `test`: Adding missing tests or correcting existing tests
- `perf`: A code change that improves performance

## Guidelines
- Write all commit messages and descriptions in **English**.
- Use the imperative present tense: "add", "fix", "refactor", not "added", "fixes", "refactoring".
- The subject line should be concise (around 50-72 characters) and must not end with a period.
- If breaking changes are introduced, indicate them in the body/footer with `BREAKING CHANGE:`.
