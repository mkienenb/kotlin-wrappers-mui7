@file:JsModule("@mui/material/Skeleton")

package mui.material

import mui.system.PropsWithSx
import mui.types.PropsWithComponent

external interface SkeletonProps :
    react.PropsWithChildren,
    react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
    PropsWithComponent,
    PropsWithSx {
    override var children: react.ReactNode?
    var animation: dynamic
    var height: dynamic
    var variant: SkeletonVariant?
    var width: dynamic
}

@JsName("default")
external val Skeleton: react.FC<SkeletonProps>
