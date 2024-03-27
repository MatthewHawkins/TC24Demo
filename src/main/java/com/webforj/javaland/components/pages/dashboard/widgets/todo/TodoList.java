package com.webforj.javaland.components.pages.dashboard.widgets.todo;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import com.webforj.App;
import com.webforj.component.html.elements.Div;
import com.webforj.component.optioninput.CheckBox;
import com.webforj.javaland.components.pages.dashboard.widgets.todo.model.TodoItem;
import com.webforj.javaland.components.pages.dashboard.widgets.todo.model.TodoRepository;

public class TodoList extends Div {
  private final TodoRepository repository;
  private List<CheckBox> checkBoxes = new ArrayList<>();
  private Div list;

  /**
   * Creates a new instance of {@link TodoList}.
   *
   * @param repository the repository to use
   */
  public TodoList(TodoRepository repository) {
    this.repository = repository;
    this.repository.addChangeListener(new RepositoryChangeListener());
    list = new Div();
    list.addClassName("todo__list");
    repository.getItems().forEach(item -> {
      addCheckbox(item);
    });

    add(list);
  }

  private void addCheckbox(TodoItem item) {
    CheckBox checkBox = new CheckBox();
    checkBox.setUserData("id", item.getId());
    App.consoleLog(checkBox.getUserData("id") + "");
    checkBox.setText(item.getText());
    checkBox.setChecked(item.isCompleted());
    checkBox.addClassName("todo__item");
    checkBox.onToggle(e -> {
      item.setCompleted(checkBox.isChecked());
    });

    checkBoxes.add(checkBox);
    list.add(checkBox);
  }

  private class RepositoryChangeListener implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
      if (evt.getPropertyName().equals("added")) {
        addCheckbox((TodoItem) evt.getNewValue());
      }

      if (evt.getPropertyName().equals("removed")) {
        TodoItem item = (TodoItem) evt.getNewValue();
        checkBoxes.forEach( e -> {
          if (e.getUserData("id") != null && item.getId() != null && e.getUserData("id").equals(item.getId())) {
            e.destroy();
        }        
        });
      }
    }
  }
}
