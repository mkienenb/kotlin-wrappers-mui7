package mui.material

import seskar.js.JsValue

sealed external interface ButtonColor {
    companion object {
        @JsValue("inherit")
        val inherit: ButtonColor

        @JsValue("primary")
        val primary: ButtonColor

        @JsValue("secondary")
        val secondary: ButtonColor

        @JsValue("success")
        val success: ButtonColor

        @JsValue("error")
        val error: ButtonColor

        @JsValue("info")
        val info: ButtonColor

        @JsValue("warning")
        val warning: ButtonColor
    }
}

sealed external interface ButtonVariant {
    companion object {
        @JsValue("text")
        val text: ButtonVariant

        @JsValue("outlined")
        val outlined: ButtonVariant

        @JsValue("contained")
        val contained: ButtonVariant
    }
}

sealed external interface AppBarColor {
    companion object {
        @JsValue("inherit")
        val inherit: AppBarColor

        @JsValue("primary")
        val primary: AppBarColor

        @JsValue("secondary")
        val secondary: AppBarColor

        @JsValue("default")
        val default: AppBarColor

        @JsValue("transparent")
        val transparent: AppBarColor

        @JsValue("error")
        val error: AppBarColor

        @JsValue("info")
        val info: AppBarColor

        @JsValue("success")
        val success: AppBarColor

        @JsValue("warning")
        val warning: AppBarColor
    }
}

sealed external interface AppBarPosition {
    companion object {
        @JsValue("fixed")
        val fixed: AppBarPosition

        @JsValue("absolute")
        val absolute: AppBarPosition

        @JsValue("sticky")
        val sticky: AppBarPosition

        @JsValue("static")
        val static: AppBarPosition

        @JsValue("relative")
        val relative: AppBarPosition
    }
}

sealed external interface ToolbarVariant {
    companion object {
        @JsValue("regular")
        val regular: ToolbarVariant

        @JsValue("dense")
        val dense: ToolbarVariant
    }
}

sealed external interface DividerVariant {
    companion object {
        @JsValue("fullWidth")
        val fullWidth: DividerVariant

        @JsValue("inset")
        val inset: DividerVariant

        @JsValue("middle")
        val middle: DividerVariant
    }
}

sealed external interface Orientation {
    companion object {
        @JsValue("horizontal")
        val horizontal: Orientation

        @JsValue("vertical")
        val vertical: Orientation
    }
}

sealed external interface DividerTextAlign {
    companion object {
        @JsValue("center")
        val center: DividerTextAlign

        @JsValue("left")
        val left: DividerTextAlign

        @JsValue("right")
        val right: DividerTextAlign
    }
}

sealed external interface CircularProgressColor {
    companion object {
        @JsValue("inherit")
        val inherit: CircularProgressColor

        @JsValue("primary")
        val primary: CircularProgressColor

        @JsValue("secondary")
        val secondary: CircularProgressColor

        @JsValue("success")
        val success: CircularProgressColor

        @JsValue("error")
        val error: CircularProgressColor

        @JsValue("info")
        val info: CircularProgressColor

        @JsValue("warning")
        val warning: CircularProgressColor
    }
}

sealed external interface CircularProgressVariant {
    companion object {
        @JsValue("determinate")
        val determinate: CircularProgressVariant

        @JsValue("indeterminate")
        val indeterminate: CircularProgressVariant
    }
}

sealed external interface AlertSeverity {
    companion object {
        @JsValue("error")
        val error: AlertSeverity

        @JsValue("warning")
        val warning: AlertSeverity

        @JsValue("info")
        val info: AlertSeverity

        @JsValue("success")
        val success: AlertSeverity
    }
}

sealed external interface AlertVariant {
    companion object {
        @JsValue("standard")
        val standard: AlertVariant

        @JsValue("filled")
        val filled: AlertVariant

        @JsValue("outlined")
        val outlined: AlertVariant
    }
}

sealed external interface SnackbarOriginVertical {
    companion object {
        @JsValue("top")
        val top: SnackbarOriginVertical

        @JsValue("bottom")
        val bottom: SnackbarOriginVertical
    }
}

sealed external interface SnackbarOriginHorizontal {
    companion object {
        @JsValue("left")
        val left: SnackbarOriginHorizontal

        @JsValue("center")
        val center: SnackbarOriginHorizontal

        @JsValue("right")
        val right: SnackbarOriginHorizontal
    }
}

sealed external interface AccordionVariant {
    companion object {
        @JsValue("standard")
        val standard: AccordionVariant

        @JsValue("outlined")
        val outlined: AccordionVariant
    }
}

sealed external interface AlertColor {
    companion object {
        @JsValue("error")
        val error: AlertColor

        @JsValue("warning")
        val warning: AlertColor

        @JsValue("info")
        val info: AlertColor

        @JsValue("success")
        val success: AlertColor
    }
}


sealed external interface ButtonGroupColor {
    companion object {
        @JsValue("inherit") val inherit: ButtonGroupColor
        @JsValue("primary") val primary: ButtonGroupColor
        @JsValue("secondary") val secondary: ButtonGroupColor
        @JsValue("success") val success: ButtonGroupColor
        @JsValue("error") val error: ButtonGroupColor
        @JsValue("info") val info: ButtonGroupColor
        @JsValue("warning") val warning: ButtonGroupColor
    }
}

sealed external interface ButtonGroupOrientation {
    companion object {
        @JsValue("horizontal") val horizontal: ButtonGroupOrientation
        @JsValue("vertical") val vertical: ButtonGroupOrientation
    }
}

sealed external interface ButtonGroupSize {
    companion object {
        @JsValue("small") val small: ButtonGroupSize
        @JsValue("medium") val medium: ButtonGroupSize
        @JsValue("large") val large: ButtonGroupSize
    }
}

sealed external interface ButtonGroupVariant {
    companion object {
        @JsValue("text") val text: ButtonGroupVariant
        @JsValue("outlined") val outlined: ButtonGroupVariant
        @JsValue("contained") val contained: ButtonGroupVariant
    }
}

sealed external interface CheckboxColor {
    companion object {
        @JsValue("default") val default: CheckboxColor
        @JsValue("primary") val primary: CheckboxColor
        @JsValue("secondary") val secondary: CheckboxColor
        @JsValue("error") val error: CheckboxColor
        @JsValue("info") val info: CheckboxColor
        @JsValue("success") val success: CheckboxColor
        @JsValue("warning") val warning: CheckboxColor
    }
}

sealed external interface CheckboxSize {
    companion object {
        @JsValue("small") val small: CheckboxSize
        @JsValue("medium") val medium: CheckboxSize
        @JsValue("large") val large: CheckboxSize
    }
}

sealed external interface FabColor {
    companion object {
        @JsValue("default") val default: FabColor
        @JsValue("inherit") val inherit: FabColor
        @JsValue("primary") val primary: FabColor
        @JsValue("secondary") val secondary: FabColor
        @JsValue("success") val success: FabColor
        @JsValue("error") val error: FabColor
        @JsValue("info") val info: FabColor
        @JsValue("warning") val warning: FabColor
    }
}

sealed external interface FabSize {
    companion object {
        @JsValue("small") val small: FabSize
        @JsValue("medium") val medium: FabSize
        @JsValue("large") val large: FabSize
    }
}

sealed external interface FabVariant {
    companion object {
        @JsValue("circular") val circular: FabVariant
        @JsValue("extended") val extended: FabVariant
    }
}

sealed external interface FormControlMargin {
    companion object {
        @JsValue("dense") val dense: FormControlMargin
        @JsValue("none") val none: FormControlMargin
        @JsValue("normal") val normal: FormControlMargin
    }
}

sealed external interface FormControlSize {
    companion object {
        @JsValue("small") val small: FormControlSize
        @JsValue("medium") val medium: FormControlSize
    }
}

sealed external interface FormControlVariant {
    companion object {
        @JsValue("filled") val filled: FormControlVariant
        @JsValue("outlined") val outlined: FormControlVariant
        @JsValue("standard") val standard: FormControlVariant
    }
}

sealed external interface FormControlLabelPlacement {
    companion object {
        @JsValue("bottom") val bottom: FormControlLabelPlacement
        @JsValue("end") val end: FormControlLabelPlacement
        @JsValue("start") val start: FormControlLabelPlacement
        @JsValue("top") val top: FormControlLabelPlacement
    }
}

sealed external interface FormHelperTextVariant {
    companion object {
        @JsValue("filled") val filled: FormHelperTextVariant
        @JsValue("outlined") val outlined: FormHelperTextVariant
        @JsValue("standard") val standard: FormHelperTextVariant
    }
}

sealed external interface IconButtonColor {
    companion object {
        @JsValue("inherit") val inherit: IconButtonColor
        @JsValue("default") val default: IconButtonColor
        @JsValue("primary") val primary: IconButtonColor
        @JsValue("secondary") val secondary: IconButtonColor
        @JsValue("error") val error: IconButtonColor
        @JsValue("info") val info: IconButtonColor
        @JsValue("success") val success: IconButtonColor
        @JsValue("warning") val warning: IconButtonColor
    }
}

sealed external interface IconButtonSize {
    companion object {
        @JsValue("small") val small: IconButtonSize
        @JsValue("medium") val medium: IconButtonSize
        @JsValue("large") val large: IconButtonSize
    }
}

sealed external interface InputAdornmentPosition {
    companion object {
        @JsValue("start") val start: InputAdornmentPosition
        @JsValue("end") val end: InputAdornmentPosition
    }
}

sealed external interface NativeSelectVariant {
    companion object {
        @JsValue("filled") val filled: NativeSelectVariant
        @JsValue("outlined") val outlined: NativeSelectVariant
        @JsValue("standard") val standard: NativeSelectVariant
    }
}

sealed external interface RadioColor {
    companion object {
        @JsValue("default") val default: RadioColor
        @JsValue("primary") val primary: RadioColor
        @JsValue("secondary") val secondary: RadioColor
        @JsValue("error") val error: RadioColor
        @JsValue("info") val info: RadioColor
        @JsValue("success") val success: RadioColor
        @JsValue("warning") val warning: RadioColor
    }
}

sealed external interface RadioSize {
    companion object {
        @JsValue("small") val small: RadioSize
        @JsValue("medium") val medium: RadioSize
        @JsValue("large") val large: RadioSize
    }
}

sealed external interface RatingSize {
    companion object {
        @JsValue("small") val small: RatingSize
        @JsValue("medium") val medium: RatingSize
        @JsValue("large") val large: RatingSize
    }
}

sealed external interface SelectVariant {
    companion object {
        @JsValue("filled") val filled: SelectVariant
        @JsValue("outlined") val outlined: SelectVariant
        @JsValue("standard") val standard: SelectVariant
    }
}

sealed external interface SliderColor {
    companion object {
        @JsValue("primary") val primary: SliderColor
        @JsValue("secondary") val secondary: SliderColor
        @JsValue("error") val error: SliderColor
        @JsValue("info") val info: SliderColor
        @JsValue("success") val success: SliderColor
        @JsValue("warning") val warning: SliderColor
    }
}

sealed external interface SliderSize {
    companion object {
        @JsValue("small") val small: SliderSize
        @JsValue("medium") val medium: SliderSize
    }
}

sealed external interface SliderTrack {
    companion object {
        @JsValue("normal") val normal: SliderTrack
        @JsValue("inverted") val inverted: SliderTrack
    }
}

sealed external interface SliderValueLabelDisplay {
    companion object {
        @JsValue("auto") val auto: SliderValueLabelDisplay
        @JsValue("on") val on: SliderValueLabelDisplay
        @JsValue("off") val off: SliderValueLabelDisplay
    }
}

sealed external interface SwitchColor {
    companion object {
        @JsValue("default") val default: SwitchColor
        @JsValue("primary") val primary: SwitchColor
        @JsValue("secondary") val secondary: SwitchColor
        @JsValue("error") val error: SwitchColor
        @JsValue("info") val info: SwitchColor
        @JsValue("success") val success: SwitchColor
        @JsValue("warning") val warning: SwitchColor
    }
}

sealed external interface SwitchSize {
    companion object {
        @JsValue("small") val small: SwitchSize
        @JsValue("medium") val medium: SwitchSize
    }
}

sealed external interface TextFieldColor {
    companion object {
        @JsValue("primary") val primary: TextFieldColor
        @JsValue("secondary") val secondary: TextFieldColor
        @JsValue("error") val error: TextFieldColor
        @JsValue("info") val info: TextFieldColor
        @JsValue("success") val success: TextFieldColor
        @JsValue("warning") val warning: TextFieldColor
    }
}

sealed external interface TextFieldMargin {
    companion object {
        @JsValue("dense") val dense: TextFieldMargin
        @JsValue("none") val none: TextFieldMargin
        @JsValue("normal") val normal: TextFieldMargin
    }
}

sealed external interface TextFieldVariant {
    companion object {
        @JsValue("filled") val filled: TextFieldVariant
        @JsValue("outlined") val outlined: TextFieldVariant
        @JsValue("standard") val standard: TextFieldVariant
    }
}

sealed external interface ToggleButtonColor {
    companion object {
        @JsValue("standard") val standard: ToggleButtonColor
        @JsValue("primary") val primary: ToggleButtonColor
        @JsValue("secondary") val secondary: ToggleButtonColor
        @JsValue("error") val error: ToggleButtonColor
        @JsValue("info") val info: ToggleButtonColor
        @JsValue("success") val success: ToggleButtonColor
        @JsValue("warning") val warning: ToggleButtonColor
    }
}

sealed external interface ToggleButtonSize {
    companion object {
        @JsValue("small") val small: ToggleButtonSize
        @JsValue("medium") val medium: ToggleButtonSize
        @JsValue("large") val large: ToggleButtonSize
    }
}