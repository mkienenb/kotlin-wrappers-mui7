@file:JsModule("@mui/material/Grid2")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface Grid2Props :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var columns: dynamic
    var columnSpacing: dynamic
    var container: Boolean?
    var direction: dynamic
    var offset: dynamic
    var rowSpacing: dynamic
    var size: dynamic
    var spacing: dynamic
    var wrap: dynamic
}

@JsName("default")
external val Grid2: react.FC<Grid2Props>
