@file:JsModule("@mui/material/Fab")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface FabProps :
    react.PropsWithChildren,
    react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var color: FabColor?
    var disabled: Boolean?
    var disableFocusRipple: Boolean?
    var disableRipple: Boolean?
    var href: String?
    var size: FabSize?
    var variant: FabVariant?
}

@JsName("default")
external val Fab: react.FC<FabProps>
