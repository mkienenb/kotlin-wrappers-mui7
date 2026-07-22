@file:JsModule("@mui/material/ImageList")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface ImageListProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLUListElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var cols: Number?
    var gap: Number?
    var rowHeight: dynamic
    var variant: ImageListVariant?
}

@JsName("default")
external val ImageList: react.FC<ImageListProps>
