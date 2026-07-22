@file:JsModule("@mui/material/SnackbarContent")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface SnackbarContentProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var action: react.ReactNode?
    var message: react.ReactNode?
}

@JsName("default")
external val SnackbarContent: react.FC<SnackbarContentProps>