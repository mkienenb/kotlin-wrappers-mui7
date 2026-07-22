@file:JsModule("@mui/material/Stack")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface StackProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var direction: dynamic
    var divider: react.ReactNode?
    var spacing: dynamic
    var useFlexGap: Boolean?
}

@JsName("default")
external val Stack: react.FC<StackProps>
