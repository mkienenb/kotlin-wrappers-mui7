@file:JsModule("@mui/material/DialogContentText")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface DialogContentTextProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLParagraphElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
}

@JsName("default")
external val DialogContentText: react.FC<DialogContentTextProps>
