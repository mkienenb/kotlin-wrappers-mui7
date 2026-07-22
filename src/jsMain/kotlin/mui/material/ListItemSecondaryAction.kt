@file:JsModule("@mui/material/ListItemSecondaryAction")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface ListItemSecondaryActionProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
}

@JsName("default")
external val ListItemSecondaryAction: react.FC<ListItemSecondaryActionProps>
