@file:JsModule("@mui/material/TableRow")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface TableRowProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLTableRowElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var hover: Boolean?
    var selected: Boolean?
}

@JsName("default")
external val TableRow: react.FC<TableRowProps>
