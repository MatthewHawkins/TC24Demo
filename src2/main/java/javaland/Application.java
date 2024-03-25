package javaland;

import com.webforj.App;
import com.webforj.annotation.AppTitle;
import com.webforj.annotation.InlineStyleSheet;
import com.webforj.component.window.Frame;
import com.webforj.exceptions.WebforjException;
import javaland.components.pages.ecom.productdetails.DetailsPage;
import javaland.components.pages.ecom.products.ProductsPage;
import javaland.components.tabbedmenu.TabbedMenu;

/**
 * A simple HelloWorld app.
 */
@InlineStyleSheet("context://css/styles.css")
@AppTitle("DWCJ Hello World")
public class Application extends App {

  @Override
  public void run() throws WebforjException {

    Frame mainFrame = new Frame();
    mainFrame.addClassName("mainFrame");
    
    
    ProductsPage productsPage = new ProductsPage();
    DetailsPage detailsPage = new DetailsPage();
    
    TabbedMenu tabbedMenu = new TabbedMenu(productsPage, detailsPage);
    
    mainFrame.add(tabbedMenu);
  }
}
