@file:JsModule("@mui/material/TableBody")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface TableBodyProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLTableSectionElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
}

@JsName("default")
external val TableBody: react.FC<TableBodyProps>
