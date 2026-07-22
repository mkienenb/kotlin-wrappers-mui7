@file:JsModule("@mui/material/Badge")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface BadgeOrigin {
    var vertical: SnackbarOriginVertical
    var horizontal: BadgeOriginHorizontal
}

sealed external interface BadgeOriginHorizontal {
    companion object {
        @seskar.js.JsValue("left") val left: BadgeOriginHorizontal
        @seskar.js.JsValue("right") val right: BadgeOriginHorizontal
    }
}

external interface BadgeProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var anchorOrigin: BadgeOrigin?
    var badgeContent: react.ReactNode?
    var color: BadgeColor?
    var invisible: Boolean?
    var max: Number?
    var overlap: BadgeOverlap?
    var showZero: Boolean?
    var slotProps: dynamic
    var slots: dynamic
    var variant: BadgeVariant?
}

@JsName("default")
external val Badge: react.FC<BadgeProps>
