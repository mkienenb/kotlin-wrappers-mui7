@file:JsModule("@mui/material/Select")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface SelectProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var autoWidth: Boolean?
    var defaultOpen: Boolean?
    override var defaultValue: dynamic
    var displayEmpty: Boolean?
    @Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")
    override var id: String?
    var input: react.ReactNode?
    var inputProps: dynamic
    var label: react.ReactNode?
    var labelId: String?
    var MenuProps: dynamic
    var multiple: Boolean?
    var native: Boolean?
    var onChange: ((event: web.events.Event) -> Unit)?
    var onClose: ((event: web.events.Event) -> Unit)?
    var onOpen: ((event: web.events.Event) -> Unit)?
    var open: Boolean?
    var renderValue: dynamic
    var SelectDisplayProps: dynamic
    var value: dynamic
    var variant: SelectVariant?
}

@JsName("default")
external val Select: react.FC<SelectProps>
