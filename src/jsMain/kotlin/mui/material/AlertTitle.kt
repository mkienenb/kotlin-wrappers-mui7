@file:JsModule("@mui/material/AlertTitle")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface AlertTitleProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
}

@JsName("default")
external val AlertTitle: react.FC<AlertTitleProps>