package com.webforj.javaland.components.pages.ecom.products.widgets;

import java.util.ArrayList;
import com.webforj.component.Composite;
import com.webforj.component.button.Button;
import com.webforj.component.button.ButtonTheme;
import com.webforj.component.field.TextField;
import com.webforj.component.field.TextField.Type;
import com.webforj.component.html.elements.Div;
import com.webforj.component.html.elements.Paragraph;
import com.webforj.component.list.ChoiceBox;
import com.webforj.component.list.ListItem;

public class SearchBar extends Composite<Div>{
  
    private Div searchContainer = new Div();
    private Div sortContainer = new Div();
    private TextField searchInput = new TextField();
    private Button searchBtn = new Button("Go");
    private Paragraph sortLbl = new Paragraph ("Sort by");
    private ChoiceBox sortDrop = new ChoiceBox();

    public SearchBar() {
    
      searchInput.setType(Type.SEARCH)
                 .setPlaceholder("Search...");
    
      searchContainer.add(searchInput, searchBtn);
      searchContainer.addClassName("search-container");
    
      ArrayList<ListItem> categories = new ArrayList<>();
      categories.add(new ListItem("All"));
      categories.add(new ListItem("Popular"));
      categories.add(new ListItem("Price Low to High"));
      categories.add(new ListItem("Price High to Low"));
      categories.add(new ListItem("Sold Out"));
      
      searchBtn.setTheme(ButtonTheme.OUTLINED_PRIMARY);

      sortDrop.insert(categories)
                  .selectIndex(0)
                  .addClassName("sort-drop");
      
      sortLbl.setVisible(true)
             .addClassName("sort-label");
      
      sortContainer.add(sortLbl, sortDrop);
      sortContainer.addClassName("sort-container");
    
      getBoundComponent().addClassName("search-bar")
      .add(searchContainer, sortContainer); 
    
  }

}
