@file:JsModule("@mui/material/Table")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface TableProps :
    react.PropsWithChildren,
    react.dom.html.TableHTMLAttributes<web.html.HTMLTableElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var padding: TablePadding?
    var size: TableSize?
    var stickyHeader: Boolean?
}

@JsName("default")
external val Table: react.FC<TableProps>
