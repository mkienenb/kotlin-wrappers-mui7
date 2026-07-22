@file:JsModule("@mui/material/Icon")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface IconProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var baseClassName: String?
    var color: IconColor?
    var fontSize: IconFontSize?
}

@JsName("default")
external val Icon: react.FC<IconProps>
