@file:JsModule("@mui/material/ListItemText")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface ListItemTextProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var disableTypography: Boolean?
    var inset: Boolean?
    var primary: react.ReactNode?
    var primaryTypographyProps: dynamic
    var secondary: react.ReactNode?
    var secondaryTypographyProps: dynamic
}

@JsName("default")
external val ListItemText: react.FC<ListItemTextProps>
