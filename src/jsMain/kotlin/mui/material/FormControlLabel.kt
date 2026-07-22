@file:JsModule("@mui/material/FormControlLabel")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface FormControlLabelProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLLabelElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var checked: Boolean?
    var control: react.ReactNode?
    var disabled: Boolean?
    var disableTypography: Boolean?
    var label: react.ReactNode?
    var labelPlacement: FormControlLabelPlacement?
    var onChange: dynamic
    var required: Boolean?
    var value: dynamic
}

@JsName("default")
external val FormControlLabel: react.FC<FormControlLabelProps>
