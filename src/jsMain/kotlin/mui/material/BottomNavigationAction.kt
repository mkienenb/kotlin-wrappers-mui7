@file:JsModule("@mui/material/BottomNavigationAction")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface BottomNavigationActionProps :
    react.PropsWithChildren,
    react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var icon: react.ReactNode?
    var label: react.ReactNode?
    var showLabel: Boolean?
    var value: dynamic
}

@JsName("default")
external val BottomNavigationAction: react.FC<BottomNavigationActionProps>
