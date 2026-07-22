@file:JsModule("@mui/material/Popover")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface PopoverOrigin {
    var vertical: dynamic
    var horizontal: dynamic
}

external interface PopoverProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var anchorEl: dynamic
    var anchorOrigin: PopoverOrigin?
    var anchorPosition: dynamic
    var anchorReference: PopoverAnchorReference?
    var container: dynamic
    var elevation: Number?
    var marginThreshold: Number?
    var onClose: ((event: web.events.Event) -> Unit)?
    var open: Boolean?
    var PaperProps: dynamic
    var slotProps: dynamic
    var slots: dynamic
    var transformOrigin: PopoverOrigin?
    var transitionDuration: dynamic
    var TransitionProps: dynamic
}

@JsName("default")
external val Popover: react.FC<PopoverProps>
