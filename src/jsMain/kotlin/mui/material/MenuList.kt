@file:JsModule("@mui/material/MenuList")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface MenuListProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLUListElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var autoFocus: Boolean?
    var autoFocusItem: Boolean?
    var disabledItemsFocusable: Boolean?
    var disableListWrap: Boolean?
    var variant: MenuVariant?
}

@JsName("default")
external val MenuList: react.FC<MenuListProps>
