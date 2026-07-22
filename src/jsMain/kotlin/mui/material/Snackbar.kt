@file:JsModule("@mui/material/Snackbar")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface SnackbarOrigin {
    var vertical: SnackbarOriginVertical
    var horizontal: SnackbarOriginHorizontal
}

external interface SnackbarProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var action: react.ReactNode?
    var anchorOrigin: SnackbarOrigin?
    var autoHideDuration: Number?
    var disableWindowBlurListener: Boolean?
    var message: react.ReactNode?
    var onClose: ((event: web.events.Event, reason: String) -> Unit)?
    var open: Boolean?
    var resumeHideDuration: Number?
    var slotProps: dynamic
    var slots: dynamic
}

@JsName("default")
external val Snackbar: react.FC<SnackbarProps>
