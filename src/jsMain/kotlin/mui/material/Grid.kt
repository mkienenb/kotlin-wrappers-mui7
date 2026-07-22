@file:JsModule("@mui/material/Grid")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface GridProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var columns: dynamic
    var columnSpacing: dynamic
    var container: Boolean?
    var direction: GridDirection?
    var item: Boolean?
    var lg: dynamic
    var md: dynamic
    var rowSpacing: dynamic
    var sm: dynamic
    var spacing: dynamic
    var wrap: GridWrap?
    var xl: dynamic
    var xs: dynamic
    var zeroMinWidth: Boolean?
}

@JsName("default")
external val Grid: react.FC<GridProps>
