@file:JsModule("@mui/material/Accordion")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface AccordionProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var defaultExpanded: Boolean?
    var disabled: Boolean?
    var disableGutters: Boolean?
    var expanded: Boolean?
    var onChange: ((event: web.events.Event, expanded: Boolean) -> Unit)?
    var slotProps: dynamic
    var slots: dynamic
    var square: Boolean?
    var variant: AccordionVariant?
}

@JsName("default")
external val Accordion: react.FC<AccordionProps>