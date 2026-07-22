@file:JsModule("@mui/material/DialogActions")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface DialogActionsProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var disableSpacing: Boolean?
}

@JsName("default")
external val DialogActions: react.FC<DialogActionsProps>
