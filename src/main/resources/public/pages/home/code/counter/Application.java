web! = BBjAPI().getWebManager()
web!.setMeta("viewport", "width=device-width, initial-scale=1.0, viewport-fit=cover, user-scalable=no")
sysgui! =  BBjAPI().openSysGui("X0")

wnd! = sysgui!.addWindow("Counter", $01101000$)
wnd!.setCallback(BBjAPI.ON_CLOSE,"eoj")

header! = wnd!.addStaticText(wnd!.getAvailableControlID(), "Simple Counter")
counter! = 0
counterText! = wnd!.addStaticText(wnd!.getAvailableControlID(),"Count: " + counter!.toString())
button! = wnd!.addButton("Counter")
button!.setCallback(button!.ON_BUTTON_PUSH, "increment")

process_events

eoj: release

increment:
counter! = counter! + 1
counterText!.setText("Count: " + counter!.toString())
return