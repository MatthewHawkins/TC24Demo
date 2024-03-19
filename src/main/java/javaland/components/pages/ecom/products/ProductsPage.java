package javaland.components.pages.ecom.products;

import com.webforj.component.html.elements.Div;
import com.webforj.component.html.elements.Paragraph;

public class ProductsPage extends Div{
  
  public ProductsPage(){
    
    Paragraph productsTitle = new Paragraph("Products");
    productsTitle.addClassName("page-title");
    
    Products products = new Products();
    
    SearchBar searchBar = new SearchBar();
    
    this.add(productsTitle, searchBar, products);
    this.addClassName("background");
    
  }

}
