package com.webforj.javaland.components.pages;

import com.webforj.annotation.InlineStyleSheet;
import com.webforj.component.html.elements.Div;
import com.webforj.component.html.elements.Iframe;
import com.webforj.component.htmlcontainer.HtmlContainer;

@InlineStyleSheet(id = "javaland-page-documentation", value = "context://public/pages/documentation.css", once = true)
public final class Documentation extends Div {

  public Documentation() {

    addClassName("page page--documentation");

    // HtmlContainer hc = new HtmlContainer();
    // hc.setUrl("https://dwcj.org/");
    // hc.setStyle("width", "100%");
    // hc.setStyle("height", "100%");

    Iframe docs = new Iframe();
    docs.setSrc("https://documentation.webforj.com");
    docs.setStyle("width", "100%");
    docs.setStyle("height", "90dvh");
    add(docs);
  }
}
