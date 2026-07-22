@file:JsModule("@mui/material/Drawer")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface DrawerProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var anchor: DrawerAnchor?
    var elevation: Number?
    var hideBackdrop: Boolean?
    var ModalProps: dynamic
    var onClose: ((event: web.events.Event) -> Unit)?
    var open: Boolean?
    var PaperProps: dynamic
    var slotProps: dynamic
    var slots: dynamic
    var SlideProps: dynamic
    var transitionDuration: dynamic
    var variant: DrawerVariant?
}

@JsName("default")
external val Drawer: react.FC<DrawerProps>
