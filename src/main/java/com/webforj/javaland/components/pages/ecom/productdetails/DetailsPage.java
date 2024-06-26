package com.webforj.javaland.components.pages.ecom.productdetails;

import com.webforj.component.html.elements.Div;
import com.webforj.component.html.elements.Paragraph;
import com.webforj.javaland.components.pages.ecom.productdetails.widgets.ProductDetails;
import com.webforj.javaland.components.pages.ecom.productdetails.widgets.ProductImage;

public class DetailsPage extends Div{

  public DetailsPage() {
    
    Paragraph productDetailTitle = new Paragraph("Product Details");
    productDetailTitle.addClassName("page-title");
    
    String[] imageUrls = {
        "context://public/img/thumbnail-1.jpeg",
        "context://public/img/thumbnail-2.jpeg",
        "context://public/img/thumbnail-3.jpeg",
        "context://public/img/thumbnail-4.jpeg",
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
