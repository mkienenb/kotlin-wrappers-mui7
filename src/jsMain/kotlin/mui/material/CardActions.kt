@file:JsModule("@mui/material/CardActions")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface CardActionsProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var disableSpacing: Boolean?
}

@JsName("default")
external val CardActions: react.FC<CardActionsProps>
