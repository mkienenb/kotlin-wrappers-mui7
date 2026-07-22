@file:JsModule("@mui/material/ClickAwayListener")

package mui.material

external interface ClickAwayListenerProps : react.PropsWithChildren {
    override var children: react.ReactNode?
    var mouseEvent: ClickAwayMouseEvent?
    var onClickAway: ((event: web.events.Event) -> Unit)?
    var touchEvent: ClickAwayTouchEvent?
}

@JsName("default")
external val ClickAwayListener: react.FC<ClickAwayListenerProps>
