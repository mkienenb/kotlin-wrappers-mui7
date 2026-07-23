@file:JsModule("@mui/material/MenuItem")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface MenuItemProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLLIElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    override var autoFocus: Boolean?
    var dense: Boolean?
    var disabled: Boolean?
    var disableGutters: Boolean?
    var divider: Boolean?
    var focusVisibleClassName: String?
    var selected: Boolean?
}

@JsName("default")
external val MenuItem: react.FC<MenuItemProps>
