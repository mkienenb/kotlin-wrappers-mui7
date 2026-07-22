@file:JsModule("@mui/material/Stepper")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface StepperProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var activeStep: Number?
    var alternativeLabel: Boolean?
    var connector: react.ReactNode?
    var nonLinear: Boolean?
    var orientation: StepperOrientation?
}

@JsName("default")
external val Stepper: react.FC<StepperProps>
