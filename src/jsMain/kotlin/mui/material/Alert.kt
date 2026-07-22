@file:JsModule("@mui/material/Alert")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface AlertProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var action: react.ReactNode?
    var color: AlertColor?
    var icon: react.ReactNode?
    var onClose: ((event: web.events.Event) -> Unit)?
    var severity: AlertSeverity?
    var slotProps: dynamic
    var slots: dynamic
    var variant: AlertVariant?
}

@JsName("default")
external val Alert: react.FC<AlertProps>