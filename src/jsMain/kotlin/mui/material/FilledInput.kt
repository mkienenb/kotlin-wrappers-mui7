@file:JsModule("@mui/material/FilledInput")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface FilledInputProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var autoComplete: String?
    override var autoFocus: Boolean?
    var color: dynamic
    override var defaultValue: dynamic
    var disabled: Boolean?
    var disableUnderline: Boolean?
    var endAdornment: react.ReactNode?
    var error: Boolean?
    var fullWidth: Boolean?
    var hiddenLabel: Boolean?
    @Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")
    override var id: String?
    var inputComponent: dynamic
    var inputProps: dynamic
    var inputRef: dynamic
    var margin: dynamic
    var maxRows: dynamic
    var minRows: dynamic
    var multiline: Boolean?
    var name: String?
    var onChange: ((event: web.events.Event) -> Unit)?
    var placeholder: String?
    var readOnly: Boolean?
    var required: Boolean?
    var rows: dynamic
    var slotProps: dynamic
    var slots: dynamic
    var startAdornment: react.ReactNode?
    var type: String?
    var value: dynamic
}

@JsName("default")
external val FilledInput: react.FC<FilledInputProps>
