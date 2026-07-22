@file:JsModule("@mui/material/CardMedia")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface CardMediaProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var alt: String?
    var image: String?
    var src: String?
}

@JsName("default")
external val CardMedia: react.FC<CardMediaProps>
