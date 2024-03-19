package javaland.components.pages.ecom.productdetails;

import com.webforj.component.Composite;
import com.webforj.component.html.elements.Div;
import com.webforj.component.html.elements.Paragraph;

public class ProductDetails extends Composite<Div>{

  public ProductDetails() {

    ProductInfo productInfo = new ProductInfo(new Paragraph("Jack & Jones Men's T-shirt (Blue)"), 
                                              new Paragraph("★★★★☆ (36 Customer Reviews)"),
                                              new Paragraph("In Stock"), "$80 USD", 
                                              "$64 USD", 
                                              "Experience the perfect blend of comfort and style with our Premium Cotton Striped T-Shirt. "
                                              + "Made from 100% organic cotton, this tee is designed to provide a relaxed fit that is both "
                                              + "breathable and soft against your skin.");    
    
    ProductControls productControls = new ProductControls();
    
    getBoundComponent().addClassName("product-details")
                       .add(productInfo, productControls);
  }

}
