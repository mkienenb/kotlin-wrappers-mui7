@file:JsModule("@mui/material/LinearProgress")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface LinearProgressProps :
    react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
    PropsWithComponent,
    PropsWithSx {
    var color: LinearProgressColor?
    var value: Number?
    var valueBuffer: Number?
    var variant: LinearProgressVariant?
}

@JsName("default")
external val LinearProgress: react.FC<LinearProgressProps>
