@file:JsModule("@mui/material/ImageListItemBar")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface ImageListItemBarProps :
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    var actionIcon: react.ReactNode?
    var actionPosition: ImageListItemBarActionPosition?
    var position: ImageListItemBarPosition?
    var subtitle: react.ReactNode?
    @Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")
    override var title: react.ReactNode?
}

@JsName("default")
external val ImageListItemBar: react.FC<ImageListItemBarProps>
