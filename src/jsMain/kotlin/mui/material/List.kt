@file:JsModule("@mui/material/List")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface ListProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLUListElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var dense: Boolean?
    var disablePadding: Boolean?
    var subheader: react.ReactNode?
}

@JsName("default")
external val List: react.FC<ListProps>
