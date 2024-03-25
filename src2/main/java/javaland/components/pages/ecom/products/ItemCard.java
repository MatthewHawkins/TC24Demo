package javaland.components.pages.ecom.products;

import com.webforj.component.Composite;
import com.webforj.component.html.elements.Div;
import com.webforj.component.html.elements.Img;
  
public class ItemCard extends Composite<Div> {
    
    private Div imagediv;
    private Div namediv;
    private Div pricediv;
    private Div ratingdiv;
    private Div stockdiv;
   
    public ItemCard(String productName, Img productImage, String price, String rating, String stock){
      
      imagediv = new Div().addClassName("image");
      namediv = new Div().addClassName("name");
      pricediv = new Div().addClassName("price");
      ratingdiv = new Div().addClassName("rating");
      stockdiv = new Div().addClassName("stock");
      
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
