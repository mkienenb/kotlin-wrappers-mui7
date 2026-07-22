@file:JsModule("@mui/material/Modal")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface ModalProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var BackdropComponent: dynamic
    var BackdropProps: dynamic
    var container: dynamic
    var disableAutoFocus: Boolean?
    var disableEnforceFocus: Boolean?
    var disableEscapeKeyDown: Boolean?
    var disablePortal: Boolean?
    var disableRestoreFocus: Boolean?
    var disableScrollLock: Boolean?
    var hideBackdrop: Boolean?
    var keepMounted: Boolean?
    var onClose: ((event: web.events.Event, reason: ModalCloseReason) -> Unit)?
    var open: Boolean?
    var slotProps: dynamic
    var slots: dynamic
}

@JsName("default")
external val Modal: react.FC<ModalProps>
