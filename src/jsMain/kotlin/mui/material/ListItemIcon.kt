@file:JsModule("@mui/material/ListItemIcon")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface ListItemIconProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
}

@JsName("default")
external val ListItemIcon: react.FC<ListItemIconProps>
