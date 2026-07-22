@file:JsModule("@mui/material/Link")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface LinkProps :
    react.PropsWithChildren,
    react.dom.html.AnchorHTMLAttributes<web.html.HTMLAnchorElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var color: LinkColor?
    var underline: LinkUnderline?
    var variant: dynamic
}

@JsName("default")
external val Link: react.FC<LinkProps>
