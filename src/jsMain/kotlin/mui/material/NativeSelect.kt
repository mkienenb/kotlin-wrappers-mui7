@file:JsModule("@mui/material/NativeSelect")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface NativeSelectProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var input: react.ReactNode?
    var inputProps: dynamic
    var onChange: ((event: web.events.Event) -> Unit)?
    var value: dynamic
    var variant: NativeSelectVariant?
}

@JsName("default")
external val NativeSelect: react.FC<NativeSelectProps>
