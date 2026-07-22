@file:JsModule("@mui/material/SpeedDialIcon")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface SpeedDialIconProps :
    react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
    PropsWithComponent,
    PropsWithSx {
    var icon: react.ReactNode?
    var open: Boolean?
    var openIcon: react.ReactNode?
}

@JsName("default")
external val SpeedDialIcon: react.FC<SpeedDialIconProps>
