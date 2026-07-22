@file:JsModule("@mui/material/ListItemAvatar")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface ListItemAvatarProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
}

@JsName("default")
external val ListItemAvatar: react.FC<ListItemAvatarProps>
