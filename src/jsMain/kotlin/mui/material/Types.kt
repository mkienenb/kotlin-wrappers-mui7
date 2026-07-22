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

sealed external interface ToggleButtonGroupColor {
    companion object {
        @JsValue("standard") val standard: ToggleButtonGroupColor
        @JsValue("primary") val primary: ToggleButtonGroupColor
        @JsValue("secondary") val secondary: ToggleButtonGroupColor
        @JsValue("error") val error: ToggleButtonGroupColor
        @JsValue("info") val info: ToggleButtonGroupColor
        @JsValue("success") val success: ToggleButtonGroupColor
        @JsValue("warning") val warning: ToggleButtonGroupColor
    }
}

sealed external interface ToggleButtonGroupOrientation {
    companion object {
        @JsValue("horizontal") val horizontal: ToggleButtonGroupOrientation
        @JsValue("vertical") val vertical: ToggleButtonGroupOrientation
    }
}

sealed external interface AvatarVariant {
    companion object {
        @JsValue("circular") val circular: AvatarVariant
        @JsValue("rounded") val rounded: AvatarVariant
        @JsValue("square") val square: AvatarVariant
    }
}

sealed external interface BadgeColor {
    companion object {
        @JsValue("default") val default: BadgeColor
        @JsValue("primary") val primary: BadgeColor
        @JsValue("secondary") val secondary: BadgeColor
        @JsValue("error") val error: BadgeColor
        @JsValue("info") val info: BadgeColor
        @JsValue("success") val success: BadgeColor
        @JsValue("warning") val warning: BadgeColor
    }
}

sealed external interface BadgeOverlap {
    companion object {
        @JsValue("circular") val circular: BadgeOverlap
        @JsValue("rectangular") val rectangular: BadgeOverlap
    }
}

sealed external interface BadgeVariant {
    companion object {
        @JsValue("dot") val dot: BadgeVariant
        @JsValue("standard") val standard: BadgeVariant
    }
}

sealed external interface ChipColor {
    companion object {
        @JsValue("default") val default: ChipColor
        @JsValue("primary") val primary: ChipColor
        @JsValue("secondary") val secondary: ChipColor
        @JsValue("error") val error: ChipColor
        @JsValue("info") val info: ChipColor
        @JsValue("success") val success: ChipColor
        @JsValue("warning") val warning: ChipColor
    }
}

sealed external interface ChipSize {
    companion object {
        @JsValue("small") val small: ChipSize
        @JsValue("medium") val medium: ChipSize
    }
}

sealed external interface ChipVariant {
    companion object {
        @JsValue("filled") val filled: ChipVariant
        @JsValue("outlined") val outlined: ChipVariant
    }
}

sealed external interface IconColor {
    companion object {
        @JsValue("inherit") val inherit: IconColor
        @JsValue("action") val action: IconColor
        @JsValue("disabled") val disabled: IconColor
        @JsValue("error") val error: IconColor
        @JsValue("info") val info: IconColor
        @JsValue("primary") val primary: IconColor
        @JsValue("secondary") val secondary: IconColor
        @JsValue("success") val success: IconColor
        @JsValue("warning") val warning: IconColor
    }
}

sealed external interface IconFontSize {
    companion object {
        @JsValue("inherit") val inherit: IconFontSize
        @JsValue("large") val large: IconFontSize
        @JsValue("medium") val medium: IconFontSize
        @JsValue("small") val small: IconFontSize
    }
}

sealed external interface ImageListVariant {
    companion object {
        @JsValue("masonry") val masonry: ImageListVariant
        @JsValue("quilted") val quilted: ImageListVariant
        @JsValue("standard") val standard: ImageListVariant
        @JsValue("woven") val woven: ImageListVariant
    }
}

sealed external interface ImageListItemBarActionPosition {
    companion object {
        @JsValue("left") val left: ImageListItemBarActionPosition
        @JsValue("right") val right: ImageListItemBarActionPosition
    }
}

sealed external interface ImageListItemBarPosition {
    companion object {
        @JsValue("below") val below: ImageListItemBarPosition
        @JsValue("bottom") val bottom: ImageListItemBarPosition
        @JsValue("top") val top: ImageListItemBarPosition
    }
}

sealed external interface LinkColor {
    companion object {
        @JsValue("inherit") val inherit: LinkColor
        @JsValue("primary") val primary: LinkColor
        @JsValue("secondary") val secondary: LinkColor
        @JsValue("success") val success: LinkColor
        @JsValue("error") val error: LinkColor
        @JsValue("info") val info: LinkColor
        @JsValue("warning") val warning: LinkColor
    }
}

sealed external interface LinkUnderline {
    companion object {
        @JsValue("always") val always: LinkUnderline
        @JsValue("hover") val hover: LinkUnderline
        @JsValue("none") val none: LinkUnderline
    }
}

sealed external interface ListItemAlignItems {
    companion object {
        @JsValue("center") val center: ListItemAlignItems
        @JsValue("flex-start") val flexStart: ListItemAlignItems
    }
}

sealed external interface ListSubheaderColor {
    companion object {
        @JsValue("default") val default: ListSubheaderColor
        @JsValue("inherit") val inherit: ListSubheaderColor
        @JsValue("primary") val primary: ListSubheaderColor
    }
}

sealed external interface TablePadding {
    companion object {
        @JsValue("checkbox") val checkbox: TablePadding
        @JsValue("none") val none: TablePadding
        @JsValue("normal") val normal: TablePadding
    }
}

sealed external interface TableSize {
    companion object {
        @JsValue("medium") val medium: TableSize
        @JsValue("small") val small: TableSize
    }
}

sealed external interface TableCellAlign {
    companion object {
        @JsValue("center") val center: TableCellAlign
        @JsValue("inherit") val inherit: TableCellAlign
        @JsValue("justify") val justify: TableCellAlign
        @JsValue("left") val left: TableCellAlign
        @JsValue("right") val right: TableCellAlign
    }
}

sealed external interface TableCellPadding {
    companion object {
        @JsValue("checkbox") val checkbox: TableCellPadding
        @JsValue("none") val none: TableCellPadding
        @JsValue("normal") val normal: TableCellPadding
    }
}

sealed external interface TableCellSize {
    companion object {
        @JsValue("medium") val medium: TableCellSize
        @JsValue("small") val small: TableCellSize
    }
}

sealed external interface TableCellSortDirection {
    companion object {
        @JsValue("asc") val asc: TableCellSortDirection
        @JsValue("desc") val desc: TableCellSortDirection
    }
}

sealed external interface TableCellVariant {
    companion object {
        @JsValue("body") val body: TableCellVariant
        @JsValue("footer") val footer: TableCellVariant
        @JsValue("head") val head: TableCellVariant
    }
}

sealed external interface TableSortLabelDirection {
    companion object {
        @JsValue("asc") val asc: TableSortLabelDirection
        @JsValue("desc") val desc: TableSortLabelDirection
    }
}

sealed external interface TooltipPlacement {
    companion object {
        @JsValue("bottom") val bottom: TooltipPlacement
        @JsValue("bottom-end") val bottomEnd: TooltipPlacement
        @JsValue("bottom-start") val bottomStart: TooltipPlacement
        @JsValue("left") val left: TooltipPlacement
        @JsValue("left-end") val leftEnd: TooltipPlacement
        @JsValue("left-start") val leftStart: TooltipPlacement
        @JsValue("right") val right: TooltipPlacement
        @JsValue("right-end") val rightEnd: TooltipPlacement
        @JsValue("right-start") val rightStart: TooltipPlacement
        @JsValue("top") val top: TooltipPlacement
        @JsValue("top-end") val topEnd: TooltipPlacement
        @JsValue("top-start") val topStart: TooltipPlacement
    }
}

sealed external interface DialogMaxWidth {
    companion object {
        @JsValue("xs") val xs: DialogMaxWidth
        @JsValue("sm") val sm: DialogMaxWidth
        @JsValue("md") val md: DialogMaxWidth
        @JsValue("lg") val lg: DialogMaxWidth
        @JsValue("xl") val xl: DialogMaxWidth
    }
}

sealed external interface DialogScroll {
    companion object {
        @JsValue("body") val body: DialogScroll
        @JsValue("paper") val paper: DialogScroll
    }
}

sealed external interface LinearProgressColor {
    companion object {
        @JsValue("inherit") val inherit: LinearProgressColor
        @JsValue("primary") val primary: LinearProgressColor
        @JsValue("secondary") val secondary: LinearProgressColor
        @JsValue("error") val error: LinearProgressColor
        @JsValue("info") val info: LinearProgressColor
        @JsValue("success") val success: LinearProgressColor
        @JsValue("warning") val warning: LinearProgressColor
    }
}

sealed external interface LinearProgressVariant {
    companion object {
        @JsValue("buffer") val buffer: LinearProgressVariant
        @JsValue("determinate") val determinate: LinearProgressVariant
        @JsValue("indeterminate") val indeterminate: LinearProgressVariant
        @JsValue("query") val query: LinearProgressVariant
    }
}

sealed external interface SkeletonVariant {
    companion object {
        @JsValue("circular") val circular: SkeletonVariant
        @JsValue("rectangular") val rectangular: SkeletonVariant
        @JsValue("rounded") val rounded: SkeletonVariant
        @JsValue("text") val text: SkeletonVariant
    }
}

sealed external interface PaperVariant {
    companion object {
        @JsValue("elevation") val elevation: PaperVariant
        @JsValue("outlined") val outlined: PaperVariant
    }
}

sealed external interface DrawerAnchor {
    companion object {
        @JsValue("bottom") val bottom: DrawerAnchor
        @JsValue("left") val left: DrawerAnchor
        @JsValue("right") val right: DrawerAnchor
        @JsValue("top") val top: DrawerAnchor
    }
}

sealed external interface DrawerVariant {
    companion object {
        @JsValue("permanent") val permanent: DrawerVariant
        @JsValue("persistent") val persistent: DrawerVariant
        @JsValue("temporary") val temporary: DrawerVariant
    }
}

sealed external interface MenuVariant {
    companion object {
        @JsValue("menu") val menu: MenuVariant
        @JsValue("selectedMenu") val selectedMenu: MenuVariant
    }
}

sealed external interface PaginationColor {
    companion object {
        @JsValue("primary") val primary: PaginationColor
        @JsValue("secondary") val secondary: PaginationColor
        @JsValue("standard") val standard: PaginationColor
    }
}

sealed external interface PaginationShape {
    companion object {
        @JsValue("circular") val circular: PaginationShape
        @JsValue("rounded") val rounded: PaginationShape
    }
}

sealed external interface PaginationVariant {
    companion object {
        @JsValue("outlined") val outlined: PaginationVariant
        @JsValue("text") val text: PaginationVariant
    }
}

sealed external interface PaginationItemType {
    companion object {
        @JsValue("end-ellipsis") val endEllipsis: PaginationItemType
        @JsValue("first") val first: PaginationItemType
        @JsValue("last") val last: PaginationItemType
        @JsValue("next") val next: PaginationItemType
        @JsValue("page") val page: PaginationItemType
        @JsValue("previous") val previous: PaginationItemType
        @JsValue("start-ellipsis") val startEllipsis: PaginationItemType
    }
}

sealed external interface SpeedDialDirection {
    companion object {
        @JsValue("down") val down: SpeedDialDirection
        @JsValue("left") val left: SpeedDialDirection
        @JsValue("right") val right: SpeedDialDirection
        @JsValue("up") val up: SpeedDialDirection
    }
}

sealed external interface StepperOrientation {
    companion object {
        @JsValue("horizontal") val horizontal: StepperOrientation
        @JsValue("vertical") val vertical: StepperOrientation
    }
}

sealed external interface TabIconPosition {
    companion object {
        @JsValue("bottom") val bottom: TabIconPosition
        @JsValue("end") val end: TabIconPosition
        @JsValue("start") val start: TabIconPosition
        @JsValue("top") val top: TabIconPosition
    }
}

sealed external interface TabTextColor {
    companion object {
        @JsValue("inherit") val inherit: TabTextColor
        @JsValue("primary") val primary: TabTextColor
        @JsValue("secondary") val secondary: TabTextColor
    }
}

sealed external interface TabsIndicatorColor {
    companion object {
        @JsValue("primary") val primary: TabsIndicatorColor
        @JsValue("secondary") val secondary: TabsIndicatorColor
    }
}

sealed external interface TabsOrientation {
    companion object {
        @JsValue("horizontal") val horizontal: TabsOrientation
        @JsValue("vertical") val vertical: TabsOrientation
    }
}

sealed external interface TabsVariant {
    companion object {
        @JsValue("fullWidth") val fullWidth: TabsVariant
        @JsValue("scrollable") val scrollable: TabsVariant
        @JsValue("standard") val standard: TabsVariant
    }
}

sealed external interface ContainerMaxWidth {
    companion object {
        @JsValue("xs") val xs: ContainerMaxWidth
        @JsValue("sm") val sm: ContainerMaxWidth
        @JsValue("md") val md: ContainerMaxWidth
        @JsValue("lg") val lg: ContainerMaxWidth
        @JsValue("xl") val xl: ContainerMaxWidth
    }
}