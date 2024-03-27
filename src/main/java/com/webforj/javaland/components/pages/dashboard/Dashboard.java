package com.webforj.javaland.components.pages.dashboard;

import com.webforj.annotation.InlineStyleSheet;
import com.webforj.component.html.elements.Div;
import com.webforj.javaland.components.pages.dashboard.widgets.TopSelling;
import com.webforj.javaland.components.pages.dashboard.widgets.charts.LastSales;
import com.webforj.javaland.components.pages.dashboard.widgets.charts.LifetimeSales;
import com.webforj.javaland.components.pages.dashboard.widgets.charts.ProjectionsVsActual;
import com.webforj.javaland.components.pages.dashboard.widgets.charts.RevenueLocation;
import com.webforj.javaland.components.pages.dashboard.widgets.counters.Conversion;
import com.webforj.javaland.components.pages.dashboard.widgets.counters.Target;
import com.webforj.javaland.components.pages.dashboard.widgets.counters.TodaySales;
import com.webforj.javaland.components.pages.dashboard.widgets.counters.TodayVisits;
import com.webforj.javaland.components.pages.dashboard.widgets.counters.TotalRevenue;
import com.webforj.javaland.components.pages.dashboard.widgets.inbox.Inbox;
import com.webforj.javaland.components.pages.dashboard.widgets.teamcards.TeamCardDisplay;
import com.webforj.javaland.components.pages.dashboard.widgets.todo.Todo;


@InlineStyleSheet(id = "javaland-page-dashboard", value = "context://public/pages/dashboard.css", once = true)
public final class Dashboard extends Div {

  public Dashboard() {
    setVisible(false);
    addClassName("page page--dashboard");

    Div counters = new Div();
    counters.addClassName("countersWrapper");
    counters.add(new TotalRevenue());
    counters.add(new Target());
    counters.add(new TodaySales());
    // counters.add(new Conversion());
    // counters.add(new TodayVisits());

    Div quarterCharts = new Div();
    quarterCharts.addClassName("chartsWrapper");
    quarterCharts.add(new RevenueLocation());
    quarterCharts.add(new LifetimeSales());
    
    Div lifeTimeCharts = new Div();
    lifeTimeCharts.addClassName("chartsWrapper");
    lifeTimeCharts.add(new LastSales());
    lifeTimeCharts.add(new ProjectionsVsActual());

    Div teamCards = new Div();
    teamCards.add(new TeamCardDisplay());

    Div apps = new Div();
    apps.addClassName("appsWrapper");
    apps.add(new Todo());
    apps.add(new Inbox());

    add(
        counters,
        quarterCharts,
        new TopSelling(),
        lifeTimeCharts,
        teamCards,
        apps);

    setVisible(true);
  }
}
