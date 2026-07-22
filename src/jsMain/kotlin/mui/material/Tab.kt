@file:JsModule("@mui/material/Tab")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface TabProps :
    react.PropsWithChildren,
    react.dom.html.ButtonHTMLAttributes<web.html.HTMLButtonElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var disabled: Boolean?
    var disableFocusRipple: Boolean?
    var disableRipple: Boolean?
    var href: String?
    var icon: dynamic
    var iconPosition: TabIconPosition?
    var label: react.ReactNode?
    var value: dynamic
    var wrapped: Boolean?
}

@JsName("default")
external val Tab: react.FC<TabProps>
