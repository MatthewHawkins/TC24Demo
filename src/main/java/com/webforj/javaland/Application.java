package com.webforj.javaland;

import com.webforj.App;
import com.webforj.component.window.Frame;
import com.webforj.exceptions.WebforjException;

//@AppAttribute(name = "lang", value = "en")
//@AppTheme("system")
public final class Application extends App {

  @Override
  public void run() throws WebforjException  {

    Frame window = new Frame();
    window.setText("Dynamic Web Client for Java");
    Shell shell = new Shell();
    shell.setTitle(getPage().getTitle());

    window.add(shell);

    // window.add(new Conversion());
  }
}
