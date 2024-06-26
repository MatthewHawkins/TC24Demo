package com.webforj.javaland.components.apptemplate;

import java.util.ArrayList;
import java.util.AbstractMap.SimpleEntry;

import com.webforj.App;
import com.webforj.annotation.AppMeta;
import com.webforj.component.element.PropertyDescriptor;
import com.webforj.component.html.elements.Div;
import com.webforj.component.html.elements.Img;
import com.webforj.component.html.elements.Paragraph;
import com.webforj.component.layout.applayout.AppLayout;
import com.webforj.component.tabbedpane.TabbedPane;
import com.webforj.javaland.components.pagemanager.PageManager;

@AppMeta(name = "viewport", content = "width=device-width, initial-scale=1.0, viewport-fit=cover, user-scalable=no")
public abstract class AppTemplate extends AppLayout {
  /**
   * AppTemplate class is an abstract class which extends the AppLayout web
   * component,
   * and provides common functionality across the various application templates
   * that have been created for use in the DWCJ.
   *
   * Classes which extend Panel can be displayed in this template, and entries
   * for these programs will be added to the menu.
   */

  /** The site title */
  protected Paragraph title = new Paragraph("webforJ Application");

  /** A string to the location of the image to be displayed in the drawer */
  protected String imgPath = "https://i.ibb.co/1n4n1Nh/logo.png";

  /** The logo for the application */
  protected Img logo = new Img(this.imgPath);

  /** Displays the various classes which extend Panel as tabs within the menu */
  protected TabbedPane menu = new TabbedPane();

  /** Renders the various classes which extend Panel in the center of the layout */
  protected PageManager pageManager = new PageManager();

  /**
   * Keeps track of the different classes which extend Panel, and whether they've
   * been initially rendered
   */
  protected final ArrayList<SimpleEntry<Div, Boolean>> displayList = new ArrayList<>();

  private final PropertyDescriptor<String> selectedPage =
  PropertyDescriptor.property("selected-page", "");
  
  public AppTemplate() {

    /* Sets up the initial attributes for the menu */
    menu.hideBody(true);
    menu.setBorderless(true);

    title.addClassName("header__title");

    /*
     * Sets the behavior to be executed when a tab within the drawer is clicked on.
     * If a tab is
     * selected for the first time, the associated class will be initialized within
     * the content
     * display section to implement lazy loading.
     */
    this.menu.onSelect((ev) -> {

      int idx = ev.getTabIndex();
      // App.consoleLog(String.valueOf(idx));
      if (displayList.get(idx).getValue().equals(Boolean.FALSE)) {
        pageManager.setPage(idx, displayList.get(idx).getKey());
        displayList.get(idx).setValue(Boolean.TRUE);
      }
      
      set(selectedPage,pageManager.getPageName(idx));      
      pageManager.displayPage(idx);
      
    });

    /*
     * Sets the content of the AppLayout to be the ContentDisplay object created to
     * handle page displaying
     */
    this.addToContent(this.pageManager);

    
  }

  

  public void selectTab (int idx){
    this.menu.select(idx);
  }

  

  /**
   * Adds a tab in the drawer menu representing the desired class to be displayed
   * in the
   * content display area, and adds this program to an displayList, which helps
   * facilitate lazy
   * loading of the class.
   *
   * @param title The title of the tab in the drawer menu to be added
   * @param page  The class which extends the Panel class and is desired to be shown
   *              when the tab with
   *              the given title is clicked
   * @return The control itself
   *
   */
  public AppTemplate addPage(String title, Div page) {

    this.menu.addTab(title);
    this.pageManager.addEntry(title);
    this.displayList.add(new SimpleEntry<>(page, false));
    return this;
  }

  /**
   * Adds a tab in the drawer menu at the designated index representing the class
   * to be displayed in the
   * content display area, and adds an entry to the displayList, which helps
   * facilitate lazy
   * loading of the class.
   *
   * @param index Desired index for the new tab to display for the new program
   * @param title The title of the tab in the drawer menu to be added
   * @param page  The class which extends the Panel class and is desired to be shown
   *              when the tab with
   *              the given title is clicked
   * @return The control itself
   *
   */
  public AppTemplate insertPage(int index, String title, Div page) {
    this.menu.insertTab(index, title);
    this.displayList.add(index, new SimpleEntry<>(page, false));
    return this;
  }

  /**
   * Removes a tab from the drawer menu tab control, and also from the content
   * display if
   * this tab has already been initialized.
   *
   * @param index The index of the tab/page to be removed
   * @return The control itself
   *
   */
  public AppTemplate removePage(int index) {
    this.menu.removeTab(index);
    if (this.displayList.get(index).getValue().equals(Boolean.TRUE)) {
      this.pageManager.getPanels().removeTab(index);
    }
    this.displayList.remove(index);
    return this;
  }

  /**
   * Gets the title of the application's header
   *
   * @return The title
   */
  public String getTitle() {
    return this.title.getText();
  }

  /**
   * Returns the string of the image filepath
   *
   * @return Image filepath
   */
  public String getImagePath() {
    return this.imgPath;
  }

  /**
   * Returns the tab control inside the side drawer
   *
   * @return Drawer menu
   */
  public TabbedPane getMenu() {
    return this.menu;
  }

  /**
   * Returns the control built to facilitate the display of various pages in
   * the center of the application
   *
   * @return The content display control
   */
  public PageManager getPageManager() {
    return this.pageManager;
  }

  /**
   * Sets the title in the header
   *
   * @param title Desired title
   * @return The control itself
   */
  public AppTemplate setTitle(String title) {
    this.title.setText(title);
    return this;
  }

  /**
   * Sets the image path to be displayed in the drawer
   *
   * @param imagePath Desired filepath to an image
   * @return The control itself
   */
  public AppTemplate setImagePath(String imagePath) {
    this.imgPath = imagePath;
    return this;
  }

  /**
   * Sets the tab control within the drawer menu
   *
   * @param menu Tab control for the drawer menu
   * @return The control itself
   */
  public AppTemplate setDrawerMenu(TabbedPane menu) {
    this.menu = menu;
    return this;
  }

  /**
   * Sets the content display component
   *
   * @param content Content display to be shown
   * @return The app itself
   */
  public AppTemplate setPageManager(PageManager content) {
    this.pageManager = content;
    return this;
  }
}
