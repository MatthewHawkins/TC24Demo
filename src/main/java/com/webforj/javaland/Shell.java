package com.webforj.javaland;



import com.webforj.annotation.InlineStyleSheet;
import com.webforj.component.Expanse;
import com.webforj.component.html.elements.Div;
import com.webforj.component.html.elements.Img;
import com.webforj.component.layout.applayout.AppLayout;
import com.webforj.component.tabbedpane.TabbedPane.Alignment;
import com.webforj.javaland.components.apptemplate.AppTemplate;
import com.webforj.javaland.components.pages.Documentation;
import com.webforj.javaland.components.pages.dashboard.Dashboard;
import com.webforj.javaland.components.pages.ecom.Ecom;
import com.webforj.javaland.components.pages.home.Home;
import com.webforj.javaland.components.themeswitcher.ThemeSwitcher;


@InlineStyleSheet(id = "javaland-shell", value = "context://public/shell.css", once = true)
@InlineStyleSheet(id = "javaland-typography", value = "context://public/typography.css", once = true)
public final class Shell extends AppTemplate {

  // @Override
  // protected void create(Window panel) {
  //   super.create(panel);
  //   configureHeader();
  //   configurePages();
  // }

  public Shell(){
    configureHeader();
    configurePages();
  }

  private void configureHeader() {
    setDrawerPlacement(AppLayout.DrawerPlacement.HIDDEN);

    Div header = new Div();
    menu.setAlignment(Alignment.CENTER);
    menu.setExpanse(Expanse.LARGE);
    Img logo = new Img("context://public/img/logo.png");
    logo.addClassName("header__logo");
    header.add(logo, menu, new ThemeSwitcher());
    header.addClassName("header__primary");

    addToHeader(header);
  }

  private void configurePages() {
    addPage("<dwc-icon name='home' part='icon'></dwc-icon>  Home", new Home());
    addPage("<dwc-icon name='dashboard' part='icon'></dwc-icon>  Dashboard", new Dashboard());
    addPage("<dwc-icon name='shopping-cart' part='icon'></dwc-icon>  Ecom", new Ecom());
    addPage("<dwc-icon name='book' part='icon'></dwc-icon>  Documentation", new Documentation());
  }

  
}
