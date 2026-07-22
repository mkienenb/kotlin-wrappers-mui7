@file:JsModule("@mui/material/InputAdornment")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface InputAdornmentProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var disablePointerEvents: Boolean?
    var disableTypography: Boolean?
    var position: InputAdornmentPosition?
    var variant: dynamic
}

@JsName("default")
external val InputAdornment: react.FC<InputAdornmentProps>
