sysgui! = BBjAPI().openSysGui("X0")
window! = sysgui!.addWindow(25,25,300,300,"sl-qr-code")
window!.setCallback(window!.ON_CLOSE,"byebye")
browser! = BBjAPI().getWebManager()

url$ = "https://cdn.jsdelivr.net/npm/@shoelace-style/shoelace@latest/cdn/themes/light.css"
browser!.injectStyleUrl(url$)

url$ = "https://cdn.jsdelivr.net/npm/@shoelace-style/shoelace@latest/cdn/shoelace.js"
browser!.injectScriptUrl(url$,1,"type=module")

qr! = window!.addWebComponent(101,25,25,100,25,"sl-qr-code")
qr!.setProperty("value","https://www.basis.cloud")

process_events
byebye: bye