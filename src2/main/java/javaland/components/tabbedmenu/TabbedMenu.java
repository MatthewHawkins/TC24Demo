package javaland.components.tabbedmenu;

import com.webforj.component.html.elements.Div;
import com.webforj.component.tabbedpane.TabbedPane;
import com.webforj.component.tabbedpane.TabbedPane.Alignment;
import javaland.components.pages.ecom.cart.CheckoutPage;
import javaland.components.pages.ecom.productdetails.DetailsPage;
import javaland.components.pages.ecom.products.ProductsPage;

public class TabbedMenu extends Div{

  public TabbedMenu(ProductsPage productsPage, DetailsPage detailsPage) {
    
    TabbedPane tabbedPane = new TabbedPane();

    Div productsPageWrapper = new Div();
    productsPageWrapper.addClassName("tab-page-container");
    productsPageWrapper.add(productsPage);

    Div detailsPageWrapper = new Div();
    detailsPageWrapper.addClassName("tab-page-container");
    detailsPageWrapper.add(detailsPage); 

    tabbedPane.addTab("Products", productsPageWrapper);
    tabbedPane.addTab("Details", detailsPageWrapper);
    tabbedPane.setAlignment(Alignment.CENTER);

    this.add(tabbedPane);
  }

}
