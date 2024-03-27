package com.webforj.javaland.components.pages.dashboard.widgets.counters;

import com.webforj.component.html.elements.Div;
import com.webforj.javaland.components.animatedcounter.AnimatedCounter;

public final class Conversion extends Div {

  public Conversion() {

    AnimatedCounter counter = new AnimatedCounter("Conversion", .58);
    counter.setSuffix("%");
    counter.setIcon("chart-bar");
    counter.setTheme(AnimatedCounter.Theme.INFO);
    add(counter);
    setStyle("flex", "1 1 19%");
  }
  // @Override
  // protected void create(AbstractWindow panel) {

  //   AnimatedCounter counter = new AnimatedCounter("Conversion", .58);
  //   counter.setSuffix("%");
  //   counter.setIcon("chart-bar");
  //   counter.setTheme(AnimatedCounter.Theme.INFO);

  //   panel.add(counter);
  // }
}
