@file:JsModule("@mui/material/AccordionActions")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface AccordionActionsProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var disableSpacing: Boolean?
}

@JsName("default")
external val AccordionActions: react.FC<AccordionActionsProps>