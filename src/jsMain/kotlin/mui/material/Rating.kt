@file:JsModule("@mui/material/Rating")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface RatingProps :
    react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
    PropsWithComponent,
    PropsWithSx {
    var defaultValue: Number?
    var disabled: Boolean?
    var emptyIcon: react.ReactNode?
    var emptyLabelText: react.ReactNode?
    var getLabelText: dynamic
    var highlightSelectedOnly: Boolean?
    var icon: react.ReactNode?
    var IconContainerComponent: dynamic
    var max: Number?
    var name: String?
    var onChange: ((event: web.events.Event, value: Number?) -> Unit)?
    var onChangeActive: dynamic
    var precision: Number?
    var readOnly: Boolean?
    var size: RatingSize?
    var value: Number?
}

@JsName("default")
external val Rating: react.FC<RatingProps>
