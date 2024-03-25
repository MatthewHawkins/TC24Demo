package com.webforj.javaland.components.pages.home;


import com.webforj.App;
import com.webforj.annotation.InlineStyleSheet;
import com.webforj.annotation.JavaScript;
import com.webforj.component.html.elements.Div;
import com.webforj.javaland.components.pages.home.widgets.AppLayoutSample;
import com.webforj.javaland.components.pages.home.widgets.CounterSample;
import com.webforj.javaland.components.pages.home.widgets.Header;
import com.webforj.javaland.components.pages.home.widgets.QRCodeSample;

@JavaScript(value = "https://cdn.jsdelivr.net/npm/lazysizes@5.3.2/lazysizes.min.js")
@InlineStyleSheet(id = "javaland-page-home", value = "context://public/pages/home/home.css", once = true)
public final class Home extends Div {

  public Home() {

    addClassName("page page--home");

    add(new Header());
    add(new CounterSample());
    add(new AppLayoutSample());
    add(new QRCodeSample());

  }
}
