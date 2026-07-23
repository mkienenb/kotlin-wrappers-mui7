@file:JsModule("@mui/material/TextField")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface TextFieldProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var autoComplete: String?
    override var autoFocus: Boolean?
    var color: TextFieldColor?
    override var defaultValue: dynamic
    var disabled: Boolean?
    var error: Boolean?
    var FormHelperTextProps: dynamic
    var fullWidth: Boolean?
    var helperText: react.ReactNode?
    @Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")
    override var id: String?
    var InputLabelProps: dynamic
    var inputProps: dynamic
    var InputProps: dynamic
    var inputRef: dynamic
    var label: react.ReactNode?
    var margin: TextFieldMargin?
    var maxRows: dynamic
    var minRows: dynamic
    var multiline: Boolean?
    var name: String?
    var onChange: ((event: web.events.Event) -> Unit)?
    var placeholder: String?
    var required: Boolean?
    var rows: dynamic
    var select: Boolean?
    var SelectProps: dynamic
    var size: dynamic
    var slotProps: dynamic
    var slots: dynamic
    var type: String?
    var value: dynamic
    var variant: TextFieldVariant?
}

@JsName("default")
external val TextField: react.FC<TextFieldProps>
