@file:JsModule("@mui/material/Autocomplete")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface AutocompleteProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var autoComplete: Boolean?
    var autoHighlight: Boolean?
    var autoSelect: Boolean?
    var blurOnSelect: dynamic
    var clearOnBlur: Boolean?
    var clearOnEscape: Boolean?
    var clearText: String?
    var closeText: String?
    var defaultValue: dynamic
    var disableClearable: Boolean?
    var disableCloseOnSelect: Boolean?
    var disabled: Boolean?
    var disabledItemsFocusable: Boolean?
    var disableListWrap: Boolean?
    var disablePortal: Boolean?
    var filterOptions: dynamic
    var filterSelectedOptions: Boolean?
    var forcePopupIcon: dynamic
    var freeSolo: Boolean?
    var fullWidth: Boolean?
    var getOptionDisabled: dynamic
    var getOptionKey: dynamic
    var getOptionLabel: dynamic
    var groupBy: dynamic
    var handleHomeEndKeys: Boolean?
    var id: String?
    var includeInputInList: Boolean?
    var inputValue: String?
    var isOptionEqualToValue: dynamic
    var limitTags: Number?
    var loading: Boolean?
    var loadingText: react.ReactNode?
    var multiple: Boolean?
    var noOptionsText: react.ReactNode?
    var onChange: dynamic
    var onClose: dynamic
    var onHighlightChange: dynamic
    var onInputChange: dynamic
    var onOpen: dynamic
    var open: Boolean?
    var openOnFocus: Boolean?
    var openText: String?
    var options: dynamic
    var PaperComponent: dynamic
    var PopperComponent: dynamic
    var popupIcon: react.ReactNode?
    var readOnly: Boolean?
    var renderGroup: dynamic
    var renderInput: dynamic
    var renderOption: dynamic
    var renderTags: dynamic
    var selectOnFocus: Boolean?
    var size: dynamic
    var slotProps: dynamic
    var slots: dynamic
    var value: dynamic
}

@JsName("default")
external val Autocomplete: react.FC<AutocompleteProps>
