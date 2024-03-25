package com.webforj.javaland.components.pages.dashboard;

import com.webforj.annotation.InlineStyleSheet;
import com.webforj.component.html.elements.Div;
import com.webforj.javaland.components.pages.dashboard.widgets.TopSelling;
import com.webforj.javaland.components.pages.dashboard.widgets.charts.LastSales;
import com.webforj.javaland.components.pages.dashboard.widgets.charts.LifetimeSales;
import com.webforj.javaland.components.pages.dashboard.widgets.charts.ProjectionsVsActual;
import com.webforj.javaland.components.pages.dashboard.widgets.charts.RevenueLocation;
import com.webforj.javaland.components.pages.dashboard.widgets.counters.Conversion;
import com.webforj.javaland.components.pages.dashboard.widgets.counters.TodaySales;
import com.webforj.javaland.components.pages.dashboard.widgets.counters.TotalRevenue;
import com.webforj.javaland.components.pages.dashboard.widgets.inbox.Inbox;
import com.webforj.javaland.components.pages.dashboard.widgets.todo.Todo;


@InlineStyleSheet(id = "javaland-page-dashboard", value = "context://public/pages/dashboard.css", once = true)
public final class Dashboard extends Div {

  public Dashboard() {
    setVisible(false);
    addClassName("page page--dashboard");

    Div counters = new Div();
    counters.addClassName("countersWrapper");
    counters.add(new TotalRevenue());
    counters.add(new TodaySales());
    counters.add(new Conversion());

    Div quarterCharts = new Div();
    quarterCharts.addClassName("chartsWrapper");
    quarterCharts.add(new LastSales());
    quarterCharts.add(new RevenueLocation());

    Div lifeTimeCharts = new Div();
    lifeTimeCharts.addClassName("chartsWrapper");
    lifeTimeCharts.add(new LifetimeSales());
    lifeTimeCharts.add(new ProjectionsVsActual());

    Div apps = new Div();
    apps.addClassName("appsWrapper");
    apps.add(new Todo());
    apps.add(new Inbox());

    add(
        counters,
        quarterCharts,
        new TopSelling(),
        lifeTimeCharts,
        apps);

    setVisible(true);
  }
}
