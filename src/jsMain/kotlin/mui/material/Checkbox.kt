@file:JsModule("@mui/material/Checkbox")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface CheckboxProps :
    react.dom.html.InputHTMLAttributes<web.html.HTMLInputElement>,
    PropsWithComponent,
    PropsWithSx {
    var checked: Boolean?
    var checkedIcon: react.ReactNode?
    var color: CheckboxColor?
    var defaultChecked: Boolean?
    var disableRipple: Boolean?
    var icon: react.ReactNode?
    var indeterminate: Boolean?
    var indeterminateIcon: react.ReactNode?
    var inputProps: dynamic
    var inputRef: dynamic
    var onChange: ((event: web.events.Event, checked: Boolean) -> Unit)?
    var size: CheckboxSize?
}

@JsName("default")
external val Checkbox: react.FC<CheckboxProps>
