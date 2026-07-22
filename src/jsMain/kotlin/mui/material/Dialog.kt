@file:JsModule("@mui/material/Dialog")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface DialogProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var disableEscapeKeyDown: Boolean?
    var fullScreen: Boolean?
    var fullWidth: Boolean?
    var keepMounted: Boolean?
    var maxWidth: DialogMaxWidth?
    var onClose: ((event: web.events.Event, reason: String) -> Unit)?
    var open: Boolean?
    var PaperComponent: dynamic
    var PaperProps: dynamic
    var scroll: DialogScroll?
    var slotProps: dynamic
    var slots: dynamic
    var TransitionComponent: dynamic
    var transitionDuration: dynamic
    var TransitionProps: dynamic
}

@JsName("default")
external val Dialog: react.FC<DialogProps>
