package com.webforj.javaland.components.pages.ecom;

import com.webforj.annotation.InlineStyleSheet;
import com.webforj.component.html.elements.Div;
import com.webforj.component.tabbedpane.TabbedPane;
import com.webforj.component.tabbedpane.TabbedPane.Alignment;
import com.webforj.javaland.components.pages.ecom.checkout.CheckoutPage;
import com.webforj.javaland.components.pages.ecom.productdetails.DetailsPage;
import com.webforj.javaland.components.pages.ecom.products.ProductsPage;

@InlineStyleSheet("context://public/pages/ecom.css")
public class Ecom extends Div{
  
  private ProductsPage productsPage = new ProductsPage();
  private DetailsPage detailsPage = new DetailsPage();
  private CheckoutPage checkoutPage = new CheckoutPage();
  private TabbedPane tabbedPane = new TabbedPane();
  
  public Ecom() {
    
    addClassName("page page--ecom");

    Div productsPageWrapper = new Div();
    productsPageWrapper.addClassName("tab-page-container");
    productsPageWrapper.add(productsPage);

    Div detailsPageWrapper = new Div();
    detailsPageWrapper.addClassName("tab-page-container");
    detailsPageWrapper.add(detailsPage); 
    
    Div checkoutPageWrapper = new Div();
    checkoutPageWrapper.addClassName("tab-page-container");
    checkoutPageWrapper.add(checkoutPage);

    tabbedPane.addTab("Products", productsPageWrapper);
    tabbedPane.addTab("Details", detailsPageWrapper);
    tabbedPane.addTab("Check Out", checkoutPageWrapper);
    tabbedPane.setAlignment(Alignment.CENTER);

    this.add(tabbedPane);
  }

}
