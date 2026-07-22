@file:JsModule("@mui/material/AccordionSummary")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface AccordionSummaryProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var expandIcon: react.ReactNode?
    var focusVisibleClassName: String?
    var slotProps: dynamic
    var slots: dynamic
}

@JsName("default")
external val AccordionSummary: react.FC<AccordionSummaryProps>