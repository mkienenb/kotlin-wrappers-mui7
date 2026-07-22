@file:JsModule("@mui/material/Switch")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface SwitchProps :
    react.dom.html.InputHTMLAttributes<web.html.HTMLInputElement>,
    PropsWithComponent,
    PropsWithSx {
    var checked: Boolean?
    var checkedIcon: react.ReactNode?
    var color: SwitchColor?
    var defaultChecked: Boolean?
    var disableRipple: Boolean?
    var edge: dynamic
    var icon: react.ReactNode?
    var inputProps: dynamic
    var inputRef: dynamic
    var onChange: ((event: web.events.Event, checked: Boolean) -> Unit)?
    var size: SwitchSize?
    var value: dynamic
}

@JsName("default")
external val Switch: react.FC<SwitchProps>
