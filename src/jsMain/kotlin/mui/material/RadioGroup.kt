@file:JsModule("@mui/material/RadioGroup")

package mui.material

import mui.system.PropsWithSx

external interface RadioGroupProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithSx {
    override var children: react.ReactNode?
    var defaultValue: dynamic
    var name: String?
    var onChange: ((event: web.events.Event, value: String) -> Unit)?
    var row: Boolean?
    var value: dynamic
}

@JsName("default")
external val RadioGroup: react.FC<RadioGroupProps>
