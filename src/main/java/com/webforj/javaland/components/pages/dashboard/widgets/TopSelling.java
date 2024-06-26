package com.webforj.javaland.components.pages.dashboard.widgets;

import com.webforj.component.table.Table;
import com.webforj.component.table.renderer.Renderer;
import com.webforj.component.html.elements.Div;
import com.webforj.component.html.elements.Paragraph;
import com.webforj.javaland.components.pages.dashboard.widgets.table.ProductRecord;
import com.webforj.javaland.components.pages.dashboard.widgets.table.Service;

public final class TopSelling extends Div {

  public TopSelling() {

    Div card = new Div();
    card.addClassName("card card--topSelling");

    Paragraph header = new Paragraph();
    header.addClassName("card__header");
    header.setText("Top Selling Products");
    card.add(header);

    Table<ProductRecord> table = new Table<>();
    table.setStyle("width", "100%");
    table.setStyle("height", "542px");
    table.setRowHeight(60.0);
    table.setHeaderHeight(60.0);

    table.addColumn("ProductName", ProductRecord::getProduct).setHidden(true);
    table.addColumn("Product", new AvatarRenderer());
    table.addColumn("Price", ProductRecord::getPrice);
    table.addColumn("Quantity", ProductRecord::getQuantity);
    table.addColumn("Amount", ProductRecord::getAmount);
    table.addColumn("Image", ProductRecord::getImageURL).setHidden(true);

    table.getColumns().forEach(column -> {
      if(column.getLabel().equalsIgnoreCase("product")){
        return;
      }
      column.setSortable(true);
    });
    table.setRepository(Service.getProductRecords());
    table.addClassName("table");
    card.add(table);

    add(card);
  }

  class AvatarRenderer extends Renderer<ProductRecord> {
    @Override
    public String build() {
      return /* html */"""
          <%
          const product = cell.row.getValue('ProductName');
          const imageURL = cell.row.getValue('Image')
          %>
          <div part='avatar-renderer'>
            <img
              part='avatar-img'
              src='<%= imageURL %>' />
            <div part="avatar-text">
              <%= product %>
            </div>
          </div>
          """;
    }
  }

}
