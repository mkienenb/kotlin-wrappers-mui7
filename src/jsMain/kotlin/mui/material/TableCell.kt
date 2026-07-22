@file:JsModule("@mui/material/TableCell")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface TableCellProps :
    react.PropsWithChildren,
    react.dom.html.TdHTMLAttributes<web.html.HTMLTableCellElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var align: TableCellAlign?
    var padding: TableCellPadding?
    var size: TableCellSize?
    var sortDirection: TableCellSortDirection?
    var variant: TableCellVariant?
}

@JsName("default")
external val TableCell: react.FC<TableCellProps>
