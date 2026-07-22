@file:JsModule("@mui/material/ButtonGroup")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface ButtonGroupProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var color: ButtonGroupColor?
    var disabled: Boolean?
    var disableElevation: Boolean?
    var disableFocusRipple: Boolean?
    var disableRipple: Boolean?
    var fullWidth: Boolean?
    var orientation: ButtonGroupOrientation?
    var size: ButtonGroupSize?
    var variant: ButtonGroupVariant?
}

@JsName("default")
external val ButtonGroup: react.FC<ButtonGroupProps>
