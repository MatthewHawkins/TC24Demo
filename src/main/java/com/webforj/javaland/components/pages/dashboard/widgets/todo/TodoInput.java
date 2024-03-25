package com.webforj.javaland.components.pages.dashboard.widgets.todo;


import com.webforj.component.button.Button;
import com.webforj.component.field.TextField;
import com.webforj.component.html.elements.Div;
import com.webforj.javaland.components.pages.dashboard.widgets.todo.model.TodoRepository;

import static com.webforj.component.button.ButtonTheme.PRIMARY;

public final class TodoInput extends Div {
  private final TodoRepository repository;

  /**
   * Creates a new instance of {@link TodoInput}.
   *
   * @param repository the repository to use
   */
  public TodoInput() {
    this(null);
  }
  public TodoInput(TodoRepository repository) {
    this.repository = repository;
    Div wrapper = new Div();
    wrapper.addClassName("todo__inputWrapper");

    TextField input = new TextField();
    input.addClassName("todo__input");
    input.setPlaceholder("What needs to be done?");

    Button button = new Button("Add");
    button.setTheme(PRIMARY);
    button.addClassName("todo__button");
    button.onClick(e -> {
      repository.addItem(input.getText());
      input.setText("");
    });

    wrapper.add(input, button);
    add(wrapper);
  }
}
