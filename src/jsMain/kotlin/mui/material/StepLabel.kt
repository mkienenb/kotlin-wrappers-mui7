@file:JsModule("@mui/material/StepLabel")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface StepLabelProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLLabelElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var error: Boolean?
    var icon: react.ReactNode?
    var optional: react.ReactNode?
    var slotProps: dynamic
    var slots: dynamic
    var StepIconComponent: dynamic
    var StepIconProps: dynamic
}

@JsName("default")
external val StepLabel: react.FC<StepLabelProps>
