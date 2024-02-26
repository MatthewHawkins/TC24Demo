package javaland;

import org.dwcj.App;
import org.dwcj.annotation.AppTitle;
import org.dwcj.annotation.InlineStyleSheet;
import org.dwcj.component.window.Frame;
import org.dwcj.exceptions.DwcjException;
import javaland.components.pages.ecom.products.ProductsPage;

/**
 * A simple HelloWorld app.
 */
@InlineStyleSheet("context://css/styles.css")
@AppTitle("DWCJ Hello World")
public class Application extends App {

  @Override
  public void run() throws DwcjException {

    Frame mainFrame = new Frame();
    mainFrame.addClassName("mainFrame");
    
    ProductsPage productsPage = new ProductsPage();
    
    mainFrame.add(productsPage);
  }
}
