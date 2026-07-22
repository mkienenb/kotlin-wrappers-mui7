@file:JsModule("@mui/material/ListItem")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface ListItemProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLLIElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var alignItems: ListItemAlignItems?
    var dense: Boolean?
    var disableGutters: Boolean?
    var disablePadding: Boolean?
    var divider: Boolean?
    var secondaryAction: react.ReactNode?
}

@JsName("default")
external val ListItem: react.FC<ListItemProps>
