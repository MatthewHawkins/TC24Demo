package com.webforj.javaland.components.pages.dashboard.widgets.counters;

import com.webforj.component.html.elements.Div;
import com.webforj.javaland.components.animatedcounter.AnimatedCounter;

public final class TodaySales extends Div {

  public TodaySales() {

    AnimatedCounter counter = new AnimatedCounter("Today's Sales", 180);
    counter.setPrefix("€");
    counter.setIcon("shopping-cart");
    counter.setTheme(AnimatedCounter.Theme.SUCCESS);
    add(counter);
    setStyle("flex", "1 1 19%");
  }
}
