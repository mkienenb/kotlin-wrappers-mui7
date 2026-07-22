@file:JsModule("@mui/material/Breadcrumbs")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface BreadcrumbsProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var expandText: String?
    var itemsAfterCollapse: Number?
    var itemsBeforeCollapse: Number?
    var maxItems: Number?
    var separator: react.ReactNode?
}

@JsName("default")
external val Breadcrumbs: react.FC<BreadcrumbsProps>
