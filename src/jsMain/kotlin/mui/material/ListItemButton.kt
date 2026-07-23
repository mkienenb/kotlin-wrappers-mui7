@file:JsModule("@mui/material/ListItemButton")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface ListItemButtonProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var alignItems: ListItemAlignItems?
    override var autoFocus: Boolean?
    var dense: Boolean?
    var disabled: Boolean?
    var disableGutters: Boolean?
    var divider: Boolean?
    var focusVisibleClassName: String?
    var href: String?
    var selected: Boolean?
}

@JsName("default")
external val ListItemButton: react.FC<ListItemButtonProps>
