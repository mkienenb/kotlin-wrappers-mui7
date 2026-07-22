@file:JsModule("@mui/material/Portal")

package mui.material

external interface PortalProps : react.PropsWithChildren {
    override var children: react.ReactNode?
    var container: dynamic
    var disablePortal: Boolean?
}

@JsName("default")
external val Portal: react.FC<PortalProps>
