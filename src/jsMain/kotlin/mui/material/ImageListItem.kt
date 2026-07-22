@file:JsModule("@mui/material/ImageListItem")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface ImageListItemProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLLIElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var cols: Number?
    var rows: Number?
}

@JsName("default")
external val ImageListItem: react.FC<ImageListItemProps>
