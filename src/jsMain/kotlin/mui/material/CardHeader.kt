@file:JsModule("@mui/material/CardHeader")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface CardHeaderProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var action: react.ReactNode?
    var avatar: react.ReactNode?
    var disableTypography: Boolean?
    var subheader: react.ReactNode?
    var subheaderTypographyProps: dynamic
    var title: react.ReactNode?
    var titleTypographyProps: dynamic
}

@JsName("default")
external val CardHeader: react.FC<CardHeaderProps>
