@file:JsModule("@mui/material/AvatarGroup")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface AvatarGroupProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var max: Number?
    var renderSurplus: dynamic
    var slotProps: dynamic
    var slots: dynamic
    var spacing: dynamic
    var total: Number?
    var variant: AvatarVariant?
}

@JsName("default")
external val AvatarGroup: react.FC<AvatarGroupProps>
