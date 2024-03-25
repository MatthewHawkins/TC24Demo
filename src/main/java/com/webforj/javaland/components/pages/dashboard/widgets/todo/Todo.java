package com.webforj.javaland.components.pages.dashboard.widgets.todo;

import com.webforj.component.html.elements.Div;
import com.webforj.component.html.elements.Paragraph;
import com.webforj.javaland.components.pages.dashboard.widgets.todo.model.TodoRepository;

public class Todo extends Div {

  public Todo() {
    Div card = new Div();
    card.addClassName("card card--todo");

    Paragraph header = new Paragraph();
    header.addClassName("card__header");
    header.setText("Todo");
    card.add(header);

    TodoRepository repository = new TodoRepository();
    repository.addItem("Contact the organizers");
    repository.addItem("Register for the event", true);
    repository.addItem("Book a hotel room");
    repository.addItem("Book a flight");
    repository.addItem("Start testing your application", true);
    repository.addItem("Start preparing your presentation", true);
    repository.addItem("Build your demo application", true);
    repository.addItem("Book a demo for webforj");

    card.add(
        new TodoToolbar(repository),
        new TodoList(repository),
        new TodoInput(repository));
    add(card);
  }
}
