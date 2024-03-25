package com.webforj.javaland.components.pages.dashboard.widgets.inbox;


import com.webforj.component.button.Button;
import com.webforj.component.button.event.ButtonClickEvent;
import com.webforj.component.dialog.Dialog;
import com.webforj.component.field.TextField;
import com.webforj.component.html.elements.Div;
import com.webforj.component.textarea.TextArea;

import static com.webforj.component.button.ButtonTheme.PRIMARY;

public class Reply extends Div {

  private String title;
  private String message;
  private Dialog dialog;

  /**
   * Create a new instance of {@link Reply}.
   *
   * @param title   The title of the message.
   * @param message The message.
   */
  public Reply() {
    this("","");
  }
  
  public Reply(String title, String message) {
    this.title = title;
    this.message = message;
    dialog = new Dialog();
    dialog.setAlignment(Dialog.Alignment.TOP);
    dialog.setMaxWidth("450px");

    dialog.addClassName("dialog--reply");

    dialog.addToHeader(new Div().setHtml("<dwc-icon name='send'></dwc-icon> Reply To Message"));

    TextField to = new TextField(title);
    to.setLabel("To:");
    to.setReadOnly(true);

    TextField subject = new TextField();
    subject.addClassName("dialog__title");
    subject.setLabel("Subject:");
    subject.setPlaceholder("The subject of the message");

    TextArea text = new TextArea();
    text.addClassName("dialog__message");
    text.setText("> " + message + "\n");
    text.setAttribute("label", "Message:");

    Div dialogContent = new Div();
    dialogContent.addClassName("dialog__content")
        .add(to, subject, text);

    dialog.addToContent(dialogContent);

    Button send = new Button("Send");
    send.setTheme(PRIMARY);
    send.onClick(this::handleButtonClick);

    Button cancel = new Button("Cancel");
    cancel.onClick(this::handleButtonClick);

    dialog.addToFooter(send, cancel);

    add(dialog);
  }

  /**
   * Show the dialog.
   */
  public void show() {
    dialog.open();
  }

  private void handleButtonClick(ButtonClickEvent event) {
    dialog.close();
    dialog.destroy();
  }
}
