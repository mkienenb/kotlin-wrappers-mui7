@file:JsModule("@mui/material/Step")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface StepProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var active: Boolean?
    var completed: Boolean?
    var disabled: Boolean?
    var expanded: Boolean?
    var index: Number?
    var last: Boolean?
}

@JsName("default")
external val Step: react.FC<StepProps>
