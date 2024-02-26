package javaland.components.pages.ecom.products;

import org.dwcj.component.Composite;
import org.dwcj.component.html.elements.Div;
import org.dwcj.component.html.elements.Img;
  
public class ItemCard extends Composite<Div> {
    
    Div imagediv = new Div().addClassName("image");
    Div namediv = new Div().addClassName("name");
    Div pricediv = new Div().addClassName("price");
    Div ratingdiv = new Div().addClassName("rating");
    Div stockdiv = new Div().addClassName("stock");
   
    public ItemCard(String productName, Img productImage, String price, String rating, String stock){
      
      this.namediv.setText(productName);
      this.pricediv.setText(price);
      this.ratingdiv.setText(rating); 
      this.stockdiv.setText("Stock: " + stock);
      
      imagediv.add(productImage);
      imagediv.setStyle("background-color", "#f3f7f9");
      
      getBoundComponent().addClassName("itemcard")
                         .add(imagediv, namediv, pricediv, ratingdiv, stockdiv);   
    }
  }
