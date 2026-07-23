@file:JsModule("@mui/material/SpeedDial")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface SpeedDialProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    override var ariaLabel: String?
    var direction: SpeedDialDirection?
    var FabProps: dynamic
    @Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")
    override var hidden: Boolean?
    var icon: react.ReactNode?
    var onClose: ((event: web.events.Event, reason: String) -> Unit)?
    var onOpen: ((event: web.events.Event, reason: String) -> Unit)?
    var open: Boolean?
    var openIcon: react.ReactNode?
    var slotProps: dynamic
    var slots: dynamic
    var TransitionComponent: dynamic
    var transitionDuration: dynamic
    var TransitionProps: dynamic
}

@JsName("default")
external val SpeedDial: react.FC<SpeedDialProps>
