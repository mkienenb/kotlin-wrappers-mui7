@file:JsModule("@mui/material/Collapse")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface CollapseProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var addEndListener: dynamic
    var collapsedSize: dynamic
    var easing: dynamic
    @JsName("in")
    var `in`: Boolean?
    var mountOnEnter: Boolean?
    var onEnter: dynamic
    var onEntered: dynamic
    var onEntering: dynamic
    var onExit: dynamic
    var onExited: dynamic
    var onExiting: dynamic
    var orientation: Orientation?
    var timeout: dynamic
    var unmountOnExit: Boolean?
}

@JsName("default")
external val Collapse: react.FC<CollapseProps>
