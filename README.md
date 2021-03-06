[![JetBrains team project](https://jb.gg/badges/team.svg)](https://confluence.jetbrains.com/display/ALL/JetBrains+on+GitHub)
[![CI](https://github.com/JetBrains/kotlin-wrappers/workflows/CI/badge.svg)](https://github.com/JetBrains/kotlin-wrappers/actions)
[![Kotlin](https://img.shields.io/badge/kotlin-1.4.31-blue.svg?logo=kotlin)](http://kotlinlang.org)
[![Slack channel](https://img.shields.io/badge/chat-slack-green.svg?logo=slack)](https://kotlinlang.slack.com/messages/react/)

# Kotlin Wrappers

This repository hosts a number of [Kotlin](https://kotlinlang.org) wrappers for popular JavaScript libraries, such as
[React](https://reactjs.org/), [Mocha](https://mochajs.org/), and [styled-components](https://www.styled-components.com/).

To learn more please refer to the READMEs of individual modules:
* [kotlin-css](kotlin-css/README.md), 
* [kotlin-extensions](kotlin-extensions/README.md), 
* [kotlin-mocha](kotlin-mocha/README.md), 
* [kotlin-react](kotlin-react/README.md), 
* [kotlin-react-dom](kotlin-react-dom/README.md),
* [kotlin-react-redux](kotlin-react-redux/README.md),
* [kotlin-react-router-dom](kotlin-react-router-dom/README.md),
* [kotlin-react-table](kotlin-react-table/README.md),
* [kotlin-redux](kotlin-redux/README.md),
* [kotlin-styled](kotlin-styled/README.md).

All wrappers are available on npm: `npm install @jetbrains/<wrapper name>`

Maven and Gradle artifacts are published to [kotlin.jetbrains.space](https://kotlin.jetbrains.space), see the corresponding README files for package coordinates.

**All packages require JDK 8 to be installed.**

## Examples

1. [To-do list example](examples/src/main/kotlin/example/Todo.kt) 

2. [Tic-Tac-Toe example](examples/src/main/kotlin/example/TicTacToe.kt)

3. A port of "Thinking in React" [example](examples/src/main/kotlin/example/Product.kt)

4. An [example of using axios](examples/src/main/kotlin/example/AxiosSearch.kt) to fetch remote data. It also 
demonstrates how to add typings for an external library.

5. An [example of using Quill](examples/src/main/kotlin/example/Quill.kt) that shows how to use an external React component.

6. An [example of using react-router-dom](examples/src/main/kotlin/example/ReactRouterDom.kt) that shows how to use react-route-dom with hooks API.

7. [Building Web Applications with React and Kotlin/JS](https://play.kotlinlang.org/hands-on/Building%20Web%20Applications%20with%20React%20and%20Kotlin%20JS/01_Introduction), a tutorial by JetBrains.
 
8. [A full-stack demo application](https://github.com/mkraynov/kfsad) written in Kotlin for JetBrains Night Moscow 2019.

9. An [example of using react-table](https://github.com/aerialist7/kotlin-react-table-sample) that shows how to use react-table with hooks API.

Follow these examples to learn how to start developing your React apps with Kotlin. Good luck and have fun! 
You also can clone [my-kotlin-react-sample](https://github.com/ScottHuangZL/my-kotlin-app) to see the result directly.

## Experimental IR Backend

Please note that React wrappers in particular heavily relied on specific characteristics of the default backend, which might make your current code incompatible with the new IR backend.

### React error: "X not a function" in production mode:
- Every interface implementing `RProps` or `RState` should be marked as `external` interface. Otherwise, you will get `Uncaught ClassCastException`.
If you’re implementing these interfaces via a class, you can mark it as `@JsExport` — however, we suggest evaluating if you could use an external interface instead.
- Every component extending `RComponent` must be marked with `@JsExport`. Otherwise, you might run into issues such as `TypeError: l.render is not a function (react-dom.production.min.js:182)`
- https://youtrack.jetbrains.com/issue/KT-42427, https://youtrack.jetbrains.com/issue/KT-39506


## Contributing

Contributions to this project are welcome! Please see the open 
[issues](https://github.com/JetBrains/kotlin-wrappers/issues) or chat with us on the [#react](https://kotlinlang.slack.com/messages/react/) channel in our 
[Slack](https://slack.kotlinlang.org/). 
