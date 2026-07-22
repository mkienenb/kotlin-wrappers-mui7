@file:JsModule("@mui/material/Slider")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface SliderProps :
    react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
    PropsWithComponent,
    PropsWithSx {
    var color: SliderColor?
    var defaultValue: dynamic
    var disabled: Boolean?
    var disableSwap: Boolean?
    var getAriaLabel: dynamic
    var getAriaValueText: dynamic
    var marks: dynamic
    var max: Number?
    var min: Number?
    var name: String?
    var onChange: dynamic
    var onChangeCommitted: dynamic
    var orientation: Orientation?
    var scale: dynamic
    var shiftStep: Number?
    var size: SliderSize?
    var slotProps: dynamic
    var slots: dynamic
    var step: Number?
    var tabIndex: Number?
    var track: SliderTrack?
    var value: dynamic
    var valueLabelDisplay: SliderValueLabelDisplay?
    var valueLabelFormat: dynamic
}

@JsName("default")
external val Slider: react.FC<SliderProps>
