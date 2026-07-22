@file:JsModule("@mui/material/FormLabel")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface FormLabelProps :
    react.PropsWithChildren,
    react.dom.html.LabelHTMLAttributes<web.html.HTMLLabelElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var color: dynamic
    var disabled: Boolean?
    var error: Boolean?
    var filled: Boolean?
    var focused: Boolean?
    var required: Boolean?
}

@JsName("default")
external val FormLabel: react.FC<FormLabelProps>
