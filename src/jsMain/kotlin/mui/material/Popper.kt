@file:JsModule("@mui/material/Popper")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface PopperProps :
    react.PropsWithChildren,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var anchorEl: dynamic
    var container: dynamic
    var disablePortal: Boolean?
    var keepMounted: Boolean?
    var modifiers: dynamic
    var open: Boolean?
    var placement: PopperPlacement?
    var popperOptions: dynamic
    var popperRef: dynamic
    var transition: Boolean?
}

@JsName("default")
external val Popper: react.FC<PopperProps>
