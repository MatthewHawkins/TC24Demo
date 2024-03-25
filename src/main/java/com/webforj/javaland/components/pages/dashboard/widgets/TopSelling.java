package com.webforj.javaland.components.pages.dashboard.widgets;


import com.webforj.component.table.Table;
import com.webforj.component.html.elements.Div;
import com.webforj.component.html.elements.Paragraph;
import com.webforj.javaland.components.litetable.LiteTable;
import com.webforj.javaland.components.pages.dashboard.widgets.table.ProductRecord;
import com.webforj.javaland.components.pages.dashboard.widgets.table.Service;

import com.google.gson.JsonArray;

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
    table.setStyle("height", "56.83vh");
    table.setRowHeight(60.0);
    table.setHeaderHeight(60.0);
    

    table.addColumn("Product", ProductRecord::getProduct);
    table.addColumn("Price", ProductRecord::getPrice);
    table.addColumn("Quantity", ProductRecord::getQuantity);
    table.addColumn("Amount", ProductRecord::getAmount);

    table.getColumns().forEach(column -> column.setSortable(true));
    table.setRepository(Service.getProductRecords());
    table.addClassName("product--table");
    card.add(table);

    add(card);
  }
}
