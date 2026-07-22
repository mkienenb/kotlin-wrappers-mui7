@file:JsModule("@mui/material/Pagination")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface PaginationProps :
    react.dom.html.HTMLAttributes<web.html.HTMLElement>,
    PropsWithComponent,
    PropsWithSx {
    var boundaryCount: Number?
    var color: PaginationColor?
    var count: Number?
    var defaultPage: Number?
    var disabled: Boolean?
    var getItemAriaLabel: dynamic
    var hideNextButton: Boolean?
    var hidePrevButton: Boolean?
    var onChange: ((event: web.events.Event, page: Number) -> Unit)?
    var page: Number?
    var renderItem: dynamic
    var shape: PaginationShape?
    var showFirstButton: Boolean?
    var showLastButton: Boolean?
    var siblingCount: Number?
    var size: dynamic
    var variant: PaginationVariant?
}

@JsName("default")
external val Pagination: react.FC<PaginationProps>
