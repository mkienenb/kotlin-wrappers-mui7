@file:JsModule("@mui/material/FormControl")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface FormControlProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var color: dynamic
    var disabled: Boolean?
    var error: Boolean?
    var focused: Boolean?
    var fullWidth: Boolean?
    var hiddenLabel: Boolean?
    var margin: FormControlMargin?
    var required: Boolean?
    var size: FormControlSize?
    var variant: FormControlVariant?
}

@JsName("default")
external val FormControl: react.FC<FormControlProps>
