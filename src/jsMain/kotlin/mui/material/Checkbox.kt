@file:JsModule("@mui/material/Checkbox")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface CheckboxProps :
    react.dom.html.InputHTMLAttributes<web.html.HTMLInputElement>,
    PropsWithComponent,
    PropsWithSx {
    override var checked: Boolean?
    var checkedIcon: react.ReactNode?
    var color: CheckboxColor?
    override var defaultChecked: Boolean?
    var disableRipple: Boolean?
    var icon: react.ReactNode?
    var indeterminate: Boolean?
    var indeterminateIcon: react.ReactNode?
    var inputProps: dynamic
    var inputRef: dynamic
    @Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")
    override var onChange: ((event: web.events.Event, checked: Boolean) -> Unit)?

    @Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")
    override var size: CheckboxSize?
}

@JsName("default")
external val Checkbox: react.FC<CheckboxProps>
