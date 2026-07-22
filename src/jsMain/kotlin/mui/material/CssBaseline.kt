@file:JsModule("@mui/material/CssBaseline")

package mui.material

import mui.system.PropsWithSx

external interface CssBaselineProps :
    react.PropsWithChildren,
    PropsWithSx {
    override var children: react.ReactNode?
    var enableColorScheme: Boolean?
}

@JsName("default")
external val CssBaseline: react.FC<CssBaselineProps>
