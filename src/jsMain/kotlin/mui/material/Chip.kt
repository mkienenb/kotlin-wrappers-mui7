@file:JsModule("@mui/material/Chip")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface ChipProps :
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    var avatar: react.ReactNode?
    var clickable: Boolean?
    var color: ChipColor?
    var deleteIcon: react.ReactNode?
    var disabled: Boolean?
    var icon: react.ReactNode?
    var label: react.ReactNode?
    var onDelete: ((event: web.events.Event) -> Unit)?
    var size: ChipSize?
    var skipFocusWhenDisabled: Boolean?
    var variant: ChipVariant?
}

@JsName("default")
external val Chip: react.FC<ChipProps>
