package com.webforj.javaland.components.pages.home.widgets;

import com.webforj.component.element.Element;
import com.webforj.component.html.elements.Div;
import com.webforj.component.html.elements.Img;
import com.webforj.javaland.components.video.HTMLVideo;
import com.webforj.utilities.Assets;

public final class Header extends Div {

  public Header() {

    Div label = new Div();
    label.setHtml(
        /* html */"""
            <html>
              <Div class="home__header">
                <h1 >Dynamic Web Client</h1>
                <p>
                  DWC empowers you deliver a modern and engaging web user interface with ease, all in the BBj language.
                </p>
              </Div>
            </html>
              """);

    // Div card = new Div();
    // card.addClassName("card card--video");

    // Youtube video = new Youtube("z735T2XOLSw");
    // video.setAutoPlay(true);
    // video.setLoop(true);

    HTMLVideo video = new HTMLVideo();
    // video.setSrc("/files/basis/conquer/files/conference_draft_3.mp4");
    video.setSrc("/files/javaland/intro.mp4");
    video.setAutoplay(true);
    video.setLoop(true);
    video.setMuted(true);
    video.setControls(false);
    video.setPlaysInline(true);
    video.setPreload(true);
  
    // card.add(video);

    add(label);
  }
}
