package com.webforj.javaland.components.litetable;


import com.google.gson.JsonArray;
import com.webforj.annotation.Attribute;
import com.webforj.annotation.InlineJavaScript;
import com.webforj.component.element.ElementComposite;
import com.webforj.component.element.PropertyDescriptor;
import com.webforj.component.element.annotation.NodeName;

@NodeName("lite-table")
@InlineJavaScript(id = "lite-table", value = "context://public/components/litetable/lite-table.js", attributes = {
    @Attribute(name = "type", value = "module")
})
public final class LiteTable extends ElementComposite {

  private final PropertyDescriptor<JsonArray> COLUMNS = PropertyDescriptor.property("columns", new JsonArray());
  private final PropertyDescriptor<JsonArray> ROWS = PropertyDescriptor.property("data", new JsonArray());

  /**
   * Create a new LitTable instance
   */
  public LiteTable() {
    super();
  }

  /**
   * Set the table columns
   *
   * @param columns the columns
   * @return the table
   */
  public LiteTable setColumns(JsonArray columns) {
    set(COLUMNS, columns);
    return this;
  }

  /**
   * Get the table columns
   *
   * @return the columns
   */
  public JsonArray getColumns() {
    return get(COLUMNS);
  }

  /**
   * Set the table rows
   *
   * @param rows the rows
   * @return the table
   */
  public LiteTable setRows(JsonArray rows) {
    set(ROWS, rows);
    return this;
  }

  /**
   * Get the table rows
   *
   * @return the rows
   */
  public JsonArray getRows() {
    return get(ROWS);
  }

  /**
   * Force the table to update
   *
   * @return the table
   */
  public LiteTable requestUpdate() {
    setColumns(getColumns());
    setRows(getRows());
    return this;
  }
}
