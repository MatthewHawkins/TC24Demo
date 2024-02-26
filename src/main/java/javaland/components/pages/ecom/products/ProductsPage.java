package javaland.components.pages.ecom.products;

import org.dwcj.component.html.elements.Div;
import org.dwcj.component.html.elements.Paragraph;

public class ProductsPage extends Div{
  
  Paragraph productTitle = new Paragraph("Products");
  
  public ProductsPage(){
    
    Paragraph productsTitle = new Paragraph("Products");
    productsTitle.addClassName("products-title");
    
    Products products = new Products();
    
    SearchBar searchBar = new SearchBar();
    
    this.add(productsTitle, searchBar, products);
    this.addClassName("background");
    
  }

}
