@file:JsModule("@mui/material/Tabs")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface TabsProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var allowScrollButtonsMobile: Boolean?
    var centered: Boolean?
    var indicatorColor: TabsIndicatorColor?
    var onChange: ((event: web.events.Event, value: dynamic) -> Unit)?
    var orientation: TabsOrientation?
    var ScrollButtonComponent: dynamic
    var scrollButtons: dynamic
    var selectionFollowsFocus: Boolean?
    var slotProps: dynamic
    var slots: dynamic
    var TabIndicatorProps: dynamic
    var TabScrollButtonProps: dynamic
    var textColor: TabTextColor?
    var value: dynamic
    var variant: TabsVariant?
    var visibleScrollbar: Boolean?
}

@JsName("default")
external val Tabs: react.FC<TabsProps>
