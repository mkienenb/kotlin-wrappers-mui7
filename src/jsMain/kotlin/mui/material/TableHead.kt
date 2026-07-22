@file:JsModule("@mui/material/TableHead")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface TableHeadProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLTableSectionElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
}

@JsName("default")
external val TableHead: react.FC<TableHeadProps>
