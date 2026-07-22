@file:JsModule("@mui/material/ToggleButton")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface ToggleButtonProps :
    react.PropsWithChildren,
    react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var color: ToggleButtonColor?
    var disabled: Boolean?
    var disableFocusRipple: Boolean?
    var disableRipple: Boolean?
    var fullWidth: Boolean?
    var onChange: ((event: web.events.Event, value: dynamic) -> Unit)?
    var onClick: ((event: web.events.Event, value: dynamic) -> Unit)?
    var selected: Boolean?
    var size: ToggleButtonSize?
    var value: dynamic
}

@JsName("default")
external val ToggleButton: react.FC<ToggleButtonProps>
