@file:JsModule("@mui/material/TableSortLabel")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface TableSortLabelProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var active: Boolean?
    var direction: TableSortLabelDirection?
    var hideSortIcon: Boolean?
    var IconComponent: dynamic
}

@JsName("default")
external val TableSortLabel: react.FC<TableSortLabelProps>
