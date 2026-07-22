@file:JsModule("@mui/material/TextareaAutosize")

package mui.material

import mui.system.PropsWithSx

external interface TextareaAutosizeProps :
    react.dom.html.TextareaHTMLAttributes<web.html.HTMLTextAreaElement>,
    PropsWithSx {
    var maxRows: Number?
    var minRows: Number?
}

@JsName("default")
external val TextareaAutosize: react.FC<TextareaAutosizeProps>
