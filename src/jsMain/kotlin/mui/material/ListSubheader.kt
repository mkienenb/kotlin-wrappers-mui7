@file:JsModule("@mui/material/ListSubheader")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface ListSubheaderProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLLIElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var color: ListSubheaderColor?
    var disableGutters: Boolean?
    var disableSticky: Boolean?
    var inset: Boolean?
}

@JsName("default")
external val ListSubheader: react.FC<ListSubheaderProps>
