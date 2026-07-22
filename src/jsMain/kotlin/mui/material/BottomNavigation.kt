@file:JsModule("@mui/material/BottomNavigation")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface BottomNavigationProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var onChange: ((event: web.events.Event, value: dynamic) -> Unit)?
    var showLabels: Boolean?
    var value: dynamic
}

@JsName("default")
external val BottomNavigation: react.FC<BottomNavigationProps>
