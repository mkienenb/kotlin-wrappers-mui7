@file:JsModule("@mui/material/CardActionArea")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface CardActionAreaProps :
    react.PropsWithChildren,
    react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var focusVisibleClassName: String?
}

@JsName("default")
external val CardActionArea: react.FC<CardActionAreaProps>
