@file:JsModule("@mui/material/Avatar")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface AvatarProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var alt: String?
    var imgProps: dynamic
    var sizes: String?
    var src: String?
    var srcSet: String?
    var variant: AvatarVariant?
}

@JsName("default")
external val Avatar: react.FC<AvatarProps>
