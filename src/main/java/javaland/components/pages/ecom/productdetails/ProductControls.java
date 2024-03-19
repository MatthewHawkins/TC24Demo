package javaland.components.pages.ecom.productdetails;

import java.util.ArrayList;
import com.webforj.component.button.Button;
import com.webforj.component.html.elements.Div;
import com.webforj.component.list.ChoiceBox;
import com.webforj.component.list.ListItem;

public class ProductControls extends Div{

  public ProductControls() {
    
    ChoiceBox sizeDrop = new ChoiceBox();
    
    ArrayList<ListItem> sizeCategories = new ArrayList<>();
    sizeCategories.add(new ListItem("XS"));
    sizeCategories.add(new ListItem("S"));
    sizeCategories.add(new ListItem("M"));
    sizeCategories.add(new ListItem("L"));
    sizeCategories.add(new ListItem("XL"));
    
    sizeDrop.insert(sizeCategories)
            .setLabel("Size")
            .selectIndex(0);
    
    ChoiceBox quantityDrop = new ChoiceBox();
    
    ArrayList<ListItem> quantityCategories = new ArrayList<>();
    quantityCategories.add(new ListItem("1"));
    quantityCategories.add(new ListItem("2"));
    quantityCategories.add(new ListItem("3"));
    quantityCategories.add(new ListItem("4"));
    quantityCategories.add(new ListItem("5"));
    
    quantityDrop.insert(quantityCategories)
                .setLabel("Quantity")
                .selectIndex(0);
    
    Div controlButtons = new Div();
    Button likeButton = new Button("""
        <html>
        <bbj-icon name='heart' expanse='2xs'> </bbj-icon>
        </html>
      """);

    likeButton.addClassName("like-button");
    
    Button cartButton = new Button("Add To Cart");
    cartButton.addClassName("add-to-cart-button");
    
    controlButtons.add(likeButton, cartButton);
    controlButtons.addClassName("control-buttons-container");
    
    this.add(sizeDrop, quantityDrop, controlButtons);
    this.addClassName("controls-container");
 
  }

}
