@file:JsModule("@mui/material/StepConnector")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface StepConnectorProps :
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx

@JsName("default")
external val StepConnector: react.FC<StepConnectorProps>
