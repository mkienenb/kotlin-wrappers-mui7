@file:JsModule("@mui/material/FormHelperText")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface FormHelperTextProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLParagraphElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var disabled: Boolean?
    var error: Boolean?
    var filled: Boolean?
    var focused: Boolean?
    var margin: dynamic
    var required: Boolean?
    var variant: FormHelperTextVariant?
}

@JsName("default")
external val FormHelperText: react.FC<FormHelperTextProps>
