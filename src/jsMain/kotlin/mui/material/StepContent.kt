@file:JsModule("@mui/material/StepContent")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface StepContentProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var TransitionComponent: dynamic
    var transitionDuration: dynamic
    var TransitionProps: dynamic
}

@JsName("default")
external val StepContent: react.FC<StepContentProps>
