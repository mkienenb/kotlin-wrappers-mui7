@file:JsModule("@mui/material/DialogContent")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface DialogContentProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var dividers: Boolean?
}

@JsName("default")
external val DialogContent: react.FC<DialogContentProps>
