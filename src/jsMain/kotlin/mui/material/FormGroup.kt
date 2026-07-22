@file:JsModule("@mui/material/FormGroup")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface FormGroupProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var row: Boolean?
}

@JsName("default")
external val FormGroup: react.FC<FormGroupProps>
