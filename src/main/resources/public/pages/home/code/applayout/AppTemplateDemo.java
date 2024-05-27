use ::BBjAppLayout/BBjAppLayout.bbj::BBjAppLayout

web! = BBjAPI().getWebManager()
sysgui! =  BBjAPI().openSysGui("X0")
wnd! = sysgui!.addWindow("BBjAppLayout", $01001000$)
wnd!.setCallback(BBjAPI.ON_CLOSE,"eoj")
app! = new BBjAppLayout(wnd!)

REM .....

drawerMenu!.addTab("<dwc-icon name='dashboard'></dwc-icon>      Dashboard", -1)
drawerMenu!.addTab("<dwc-icon name='shopping-cart'></dwc-icon>  Orders", -1)
drawerMenu!.addTab("<dwc-icon name='users'></dwc-icon>          Customers", -1)
drawerMenu!.addTab("<dwc-icon name='box'></dwc-icon>            Products", -1)
drawerMenu!.addTab("<dwc-icon name='files'></dwc-icon>          Documents", -1)
drawerMenu!.addTab("<dwc-icon name='checklist'></dwc-icon>      Tasks", -1)
drawerMenu!.addTab("<dwc-icon name='chart-dots-2'></dwc-icon>   Analytics", -1)

REM .....

eoj:
  release
