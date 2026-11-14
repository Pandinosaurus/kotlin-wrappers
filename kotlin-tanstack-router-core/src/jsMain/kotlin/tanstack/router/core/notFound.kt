package tanstack.router.core

import js.objects.unsafeJso
import tanstack.router.core.raw.notFoundRaw

/**
 * Create a not-found error object recognized by TanStack Router.
 *
 * Throw this from loaders/actions to trigger the nearest `notFoundComponent`.
 * Use `routeId` to target a specific route's not-found boundary. If `throw`
 * is true, the error is thrown instead of returned.
 *
 * [API Docs](https://tanstack.com/router/latest/docs/router/framework/react/api/router/notFoundFunction)
 *
 * @return A not-found error object that can be thrown or returned.
 */
fun notFound(): Nothing =
    notFoundRaw(NotFoundError(`throw` = true))

fun notFound(
    block: NotFoundOptions.() -> Unit,
): Nothing {
    val options = unsafeJso(block)
    options.`throw` = true

    notFoundRaw<Nothing>(options)
}
