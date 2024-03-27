package com.webforj.javaland.components.pages.dashboard.widgets.teamcards;

import com.webforj.component.Composite;
import com.webforj.component.html.elements.Div;

public class TeamCardDisplay extends Composite<Div> {
  
  TeamCardWrapper teamcardWrapper = new TeamCardWrapper();

  public TeamCardDisplay() {

    String[] names = {
      "Telma Fridley",
      "Chandler Hervieux",
      "Percy Demers",
      "Antoine Masson"
  };

  String[] positions = {
      "Admin User",
      "Manager",
      "Director",
      "Premium User"
  };
    teamcardWrapper.addClassName("teamcard--wrapper");
    getBoundComponent().add(teamcardWrapper);

    for (int i = 0; i < names.length; i++) {
      TeamCard teamcard = new TeamCard();
      teamcard.setAvatar("https://coderthemes.com/ubold/layouts/default/assets/images/users/user-" + (i + 1) +".jpg");
      teamcard.setUserName(names[i]);
      teamcard.setPosition(positions[i]);
      teamcardWrapper.addTeamCard(teamcard);
    }
  }
}