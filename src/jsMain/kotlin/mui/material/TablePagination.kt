@file:JsModule("@mui/material/TablePagination")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface TablePaginationProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLTableCellElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var count: Number?
    var getItemAriaLabel: dynamic
    var labelDisplayedRows: dynamic
    var labelRowsPerPage: react.ReactNode?
    var onPageChange: ((event: web.events.Event, page: Number) -> Unit)?
    var onRowsPerPageChange: ((event: web.events.Event) -> Unit)?
    var page: Number?
    var rowsPerPage: Number?
    var rowsPerPageOptions: dynamic
    var showFirstButton: Boolean?
    var showLastButton: Boolean?
    var slotProps: dynamic
    var slots: dynamic
}

@JsName("default")
external val TablePagination: react.FC<TablePaginationProps>
