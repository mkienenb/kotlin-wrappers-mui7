@file:JsModule("@mui/material/IconButton")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface IconButtonProps :
    react.PropsWithChildren,
    react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var color: IconButtonColor?
    override var disabled: Boolean?
    var disableFocusRipple: Boolean?
    var disableRipple: Boolean?
    var edge: dynamic
    var href: String?
    var size: IconButtonSize?
}

@JsName("default")
external val IconButton: react.FC<IconButtonProps>
