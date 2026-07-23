@file:JsModule("@mui/material/SpeedDialAction")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface SpeedDialActionProps :
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    var delay: Number?
    var FabProps: dynamic
    var icon: react.ReactNode?
    @Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")
    override var id: String?
    var open: Boolean?
    var slotProps: dynamic
    var slots: dynamic
    var tooltipOpen: Boolean?
    var tooltipPlacement: TooltipPlacement?
    var tooltipTitle: react.ReactNode?
}

@JsName("default")
external val SpeedDialAction: react.FC<SpeedDialActionProps>
