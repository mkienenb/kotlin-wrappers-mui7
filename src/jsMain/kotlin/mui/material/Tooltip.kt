@file:JsModule("@mui/material/Tooltip")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface TooltipProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var arrow: Boolean?
    var describeChild: Boolean?
    var disableFocusListener: Boolean?
    var disableHoverListener: Boolean?
    var disableInteractive: Boolean?
    var disableTouchListener: Boolean?
    var enterDelay: Number?
    var enterNextDelay: Number?
    var enterTouchDelay: Number?
    var followCursor: Boolean?
    var id: String?
    var keepMounted: Boolean?
    var leaveDelay: Number?
    var leaveTouchDelay: Number?
    var onClose: ((event: web.events.Event) -> Unit)?
    var onOpen: ((event: web.events.Event) -> Unit)?
    var open: Boolean?
    var placement: TooltipPlacement?
    var PopperComponent: dynamic
    var PopperProps: dynamic
    var slotProps: dynamic
    var slots: dynamic
    var title: react.ReactNode?
    var TransitionComponent: dynamic
    var transitionDuration: dynamic
    var TransitionProps: dynamic
}

@JsName("default")
external val Tooltip: react.FC<TooltipProps>
