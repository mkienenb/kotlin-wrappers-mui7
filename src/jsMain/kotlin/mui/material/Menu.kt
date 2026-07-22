@file:JsModule("@mui/material/Menu")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface MenuProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var anchorEl: dynamic
    var autoFocus: Boolean?
    var disableAutoFocusItem: Boolean?
    var MenuListProps: dynamic
    var onClose: ((event: web.events.Event) -> Unit)?
    var open: Boolean?
    var PopoverClasses: dynamic
    var slotProps: dynamic
    var slots: dynamic
    var transitionDuration: dynamic
    var TransitionProps: dynamic
    var variant: MenuVariant?
}

@JsName("default")
external val Menu: react.FC<MenuProps>
