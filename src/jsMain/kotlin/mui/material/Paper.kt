@file:JsModule("@mui/material/Paper")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface PaperProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var elevation: Number?
    var square: Boolean?
    var variant: PaperVariant?
}

@JsName("default")
external val Paper: react.FC<PaperProps>
