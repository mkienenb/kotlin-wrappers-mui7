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