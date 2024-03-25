package com.webforj.javaland.components.pages.dashboard.widgets.table;


import java.util.ArrayList;
import com.webforj.data.repository.CollectionRepository;
import com.webforj.data.repository.Repository;


public final class Service {

  private Service() {}

  public static Repository<ProductRecord> getProductRecords() {

    String[] products = new String[] { "ASOS Ridley High Waist", "Marco Lightweight Shirt", "Half Sleeve Shirt",
        "Lightweight Jacket", "Marco Shoes", "ASOS Ridley High Waist", "Half Sleeve Shirt", "Lightweight Jacket" };
    String[] prices = new String[] { "$79.49", "$128.50", "$39.99", "$20.00", "$28.49", "$79.49", "$39.99", "$20.00" };
    String[] quantities = new String[] { "82", "37", "64", "184", "69", "82", "64", "184" };
    String[] amounts = new String[] { "$6,518.18", "$4,754.50", "$2,559.36", "$3,680.00", "$1,965.81", "$6,518.18",
        "$2,559.36", "$3,680.00" };

    ArrayList<ProductRecord> data = new ArrayList<>();
    for (int i = 0; i < products.length; i++) {
      ProductRecord record = new ProductRecord();
      record.setProduct(products[i]);
      record.setPrice(prices[i]);
      record.setQuantity(quantities[i]);
      record.setAmount(amounts[i]);
      data.add(record);
    }

    return new CollectionRepository<>(data);
  }
}