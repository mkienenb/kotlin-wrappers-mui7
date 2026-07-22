@file:JsModule("@mui/material/SwipeableDrawer")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface SwipeableDrawerProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var anchor: DrawerAnchor?
    var disableBackdropTransition: Boolean?
    var disableDiscovery: Boolean?
    var disableSwipeToOpen: Boolean?
    var hysteresis: Number?
    var minFlingVelocity: Number?
    var onClose: ((event: web.events.Event) -> Unit)?
    var onOpen: ((event: web.events.Event) -> Unit)?
    var open: Boolean?
    var swipeAreaWidth: Number?
    var variant: DrawerVariant?
}

@JsName("default")
external val SwipeableDrawer: react.FC<SwipeableDrawerProps>
