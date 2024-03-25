package com.webforj.javaland.components.pages.ecom;

import com.webforj.annotation.InlineStyleSheet;
import com.webforj.component.html.elements.Div;
import com.webforj.component.tabbedpane.TabbedPane;
import com.webforj.component.tabbedpane.TabbedPane.Alignment;
import com.webforj.javaland.components.pages.ecom.productdetails.DetailsPage;
import com.webforj.javaland.components.pages.ecom.products.ProductsPage;

@InlineStyleSheet("context://public/pages/ecom.css")
public class Ecom extends Div{
  
  private ProductsPage productsPage = new ProductsPage();
  private DetailsPage detailsPage = new DetailsPage();
  private TabbedPane tabbedPane = new TabbedPane();
  
  public Ecom() {
    
    addClassName("page page--ecom");

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
