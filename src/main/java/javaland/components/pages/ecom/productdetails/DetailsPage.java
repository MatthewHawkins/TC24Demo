package javaland.components.pages.ecom.productdetails;

import com.webforj.component.html.elements.Div;
import com.webforj.component.html.elements.Paragraph;

public class DetailsPage extends Div{

  public DetailsPage() {
    
    Paragraph productDetailTitle = new Paragraph("Product Details");
    productDetailTitle.addClassName("page-title");
    
    String[] imageUrls = {
        "context://thumbnail-1.jpeg",
        "context://thumbnail-2.jpeg",
        "context://thumbnail-3.jpeg",
        "context://thumbnail-4.jpeg",
    };

    ProductImage productImage = new ProductImage(imageUrls);
    ProductDetails productDetails = new ProductDetails();
    
    Div imageContainer = new Div();
    imageContainer.addClassName("product-image-container");
    imageContainer.add(productImage);
    
    Div productDetailsContainer = new Div();
    productDetailsContainer.addClassName("product-details-container");
    productDetailsContainer.add(imageContainer, productDetails);

    this.add(productDetailTitle, productDetailsContainer);
    this.addClassName("background");
  }

}
