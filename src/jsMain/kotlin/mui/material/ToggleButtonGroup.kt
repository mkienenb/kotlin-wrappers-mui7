@file:JsModule("@mui/material/ToggleButtonGroup")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface ToggleButtonGroupProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var color: ToggleButtonGroupColor?
    var disabled: Boolean?
    var exclusive: Boolean?
    var fullWidth: Boolean?
    var onChange: ((event: web.events.Event, value: dynamic) -> Unit)?
    var orientation: ToggleButtonGroupOrientation?
    var size: ToggleButtonSize?
    var value: dynamic
}

@JsName("default")
external val ToggleButtonGroup: react.FC<ToggleButtonGroupProps>
