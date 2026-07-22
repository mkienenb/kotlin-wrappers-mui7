@file:JsModule("@mui/material/TableContainer")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface TableContainerProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
}

@JsName("default")
external val TableContainer: react.FC<TableContainerProps>
