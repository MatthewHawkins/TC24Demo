package com.webforj.javaland.components.pages.dashboard.widgets.counters;

import com.webforj.component.html.elements.Div;
import com.webforj.javaland.components.animatedcounter.AnimatedCounter;

public final class Target extends Div {

  public Target() {

    AnimatedCounter counter = new AnimatedCounter("Target", 7306.00);
    counter.setPrefix("€");
    counter.setIcon("target");
    counter.setTheme(AnimatedCounter.Theme.DANGER);
    add(counter);
    setStyle("flex", "1 1 19%");
  }
}
