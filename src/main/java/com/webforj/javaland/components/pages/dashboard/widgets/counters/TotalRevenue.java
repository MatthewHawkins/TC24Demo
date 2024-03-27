package com.webforj.javaland.components.pages.dashboard.widgets.counters;

import com.webforj.component.html.elements.Div;
import com.webforj.javaland.components.animatedcounter.AnimatedCounter;

public final class TotalRevenue extends Div {

  public TotalRevenue() {
    AnimatedCounter counter = new AnimatedCounter("Total Revenue", 5808.947);
    counter.setPrefix("€");
    counter.setIcon("currency-euro");
    counter.setTheme(AnimatedCounter.Theme.PRIMARY);
    add(counter);
    setStyle("flex", "1 1 19%");
  }
}
