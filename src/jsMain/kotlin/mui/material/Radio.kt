@file:JsModule("@mui/material/Radio")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface RadioProps :
    react.dom.html.InputHTMLAttributes<web.html.HTMLInputElement>,
    PropsWithComponent,
    PropsWithSx {
    var checked: Boolean?
    var checkedIcon: react.ReactNode?
    var color: RadioColor?
    var defaultChecked: Boolean?
    var disableRipple: Boolean?
    var icon: react.ReactNode?
    var inputProps: dynamic
    var inputRef: dynamic
    var onChange: ((event: web.events.Event, checked: Boolean) -> Unit)?
    var size: RadioSize?
    var value: dynamic
}

@JsName("default")
external val Radio: react.FC<RadioProps>
