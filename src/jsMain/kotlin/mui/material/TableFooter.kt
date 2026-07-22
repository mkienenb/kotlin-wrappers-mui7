@file:JsModule("@mui/material/TableFooter")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface TableFooterProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLTableSectionElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
}

@JsName("default")
external val TableFooter: react.FC<TableFooterProps>
