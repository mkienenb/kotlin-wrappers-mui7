@file:JsModule("@mui/material/PaginationItem")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface PaginationItemProps :
    react.dom.html.HTMLAttributes<web.html.HTMLButtonElement>,
    PropsWithComponent,
    PropsWithSx {
    var color: PaginationColor?
    var disabled: Boolean?
    var getAriaLabel: dynamic
    var page: Number?
    var selected: Boolean?
    var shape: PaginationShape?
    var size: dynamic
    var slots: dynamic
    var type: PaginationItemType?
    var variant: PaginationVariant?
}

@JsName("default")
external val PaginationItem: react.FC<PaginationItemProps>
