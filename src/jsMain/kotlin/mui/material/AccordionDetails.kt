@file:JsModule("@mui/material/AccordionDetails")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface AccordionDetailsProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
}

@JsName("default")
external val AccordionDetails: react.FC<AccordionDetailsProps>