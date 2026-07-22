@file:JsModule("@mui/material/StepIcon")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface StepIconProps :
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    var active: Boolean?
    var completed: Boolean?
    var error: Boolean?
    var icon: react.ReactNode?
}

@JsName("default")
external val StepIcon: react.FC<StepIconProps>
