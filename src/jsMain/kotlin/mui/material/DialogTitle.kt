@file:JsModule("@mui/material/DialogTitle")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface DialogTitleProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
}

@JsName("default")
external val DialogTitle: react.FC<DialogTitleProps>
