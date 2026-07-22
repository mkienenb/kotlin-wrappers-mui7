@file:JsModule("@mui/material/StepButton")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface StepButtonProps :
    react.PropsWithChildren,
    react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var icon: react.ReactNode?
    var optional: react.ReactNode?
}

@JsName("default")
external val StepButton: react.FC<StepButtonProps>
