@file:JsModule("@mui/material/Slide")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface SlideProps :
    react.PropsWithChildren,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var addEndListener: dynamic
    var container: dynamic
    var direction: SlideDirection?
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
    var timeout: dynamic
    var unmountOnExit: Boolean?
}

@JsName("default")
external val Slide: react.FC<SlideProps>
