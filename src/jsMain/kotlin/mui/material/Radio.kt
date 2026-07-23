@file:JsModule("@mui/material/Radio")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface RadioProps :
    react.dom.html.InputHTMLAttributes<web.html.HTMLInputElement>,
    PropsWithComponent,
    PropsWithSx {
    override var checked: Boolean?
    var checkedIcon: react.ReactNode?
    var color: RadioColor?
    override var defaultChecked: Boolean?
    var disableRipple: Boolean?
    var icon: react.ReactNode?
    var inputProps: dynamic
    var inputRef: dynamic
    @Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")
    override var onChange: ((event: web.events.Event, checked: Boolean) -> Unit)?

    @Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")
    override var size: RadioSize?
    override var value: dynamic
}

@JsName("default")
external val Radio: react.FC<RadioProps>
