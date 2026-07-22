@file:JsModule("@mui/material/Backdrop")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface BackdropProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var invisible: Boolean?
    var open: Boolean?
    var slotProps: dynamic
    var slots: dynamic
    var transitionDuration: dynamic
}

@JsName("default")
external val Backdrop: react.FC<BackdropProps>
