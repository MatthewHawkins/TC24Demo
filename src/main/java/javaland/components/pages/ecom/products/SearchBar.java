package javaland.components.pages.ecom.products;

import java.util.ArrayList;
import org.dwcj.component.Composite;
import org.dwcj.component.button.Button;
import org.dwcj.component.button.ButtonTheme;
import org.dwcj.component.field.TextField;
import org.dwcj.component.field.TextField.Type;
import org.dwcj.component.html.elements.Div;
import org.dwcj.component.html.elements.Paragraph;
import org.dwcj.component.list.ChoiceBox;
import org.dwcj.component.list.ListItem;

public class SearchBar extends Composite<Div>{
  
    Div searchContainer = new Div();
    Div sortContainer = new Div();
    TextField searchInput = new TextField();
    Button searchBtn = new Button("Go");
    Paragraph sortLbl = new Paragraph ("Sort by");
    ChoiceBox sortDrop = new ChoiceBox();

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
