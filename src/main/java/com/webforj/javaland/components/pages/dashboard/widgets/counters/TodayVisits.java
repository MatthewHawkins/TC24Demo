package com.webforj.javaland.components.pages.dashboard.widgets.counters;

import com.webforj.component.html.elements.Div;
import com.webforj.javaland.components.animatedcounter.AnimatedCounter;

public final class TodayVisits extends Div {

  public TodayVisits( ) {
    AnimatedCounter counter = new AnimatedCounter("Today's Visits", 78.41);
    counter.setSuffix("K");
    counter.setIcon("eye");
    counter.setTheme(AnimatedCounter.Theme.WARNING);
    add(counter);
    setStyle("flex", "1 1 19%");
  }
}
