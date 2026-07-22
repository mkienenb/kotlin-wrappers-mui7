@file:JsModule("@mui/material/Container")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface ContainerProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var disableGutters: Boolean?
    var fixed: Boolean?
    var maxWidth: ContainerMaxWidth?
}

@JsName("default")
external val Container: react.FC<ContainerProps>
