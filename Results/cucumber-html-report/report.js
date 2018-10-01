$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/EDGE_Features/Edge_Login_Smoke_Test_Local.feature");
formatter.feature({
  "name": "Test EDGE smoke login scenario",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test login with valid credentials, select competitions, and logout",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Open Chrome on Windows and start Edge application",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "a valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "Edge_TestDefinitions.a_valid_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "each competition is selected",
  "keyword": "When "
});
formatter.match({
  "location": "Edge_TestDefinitions.each_competition_is_selected()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be able to login",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the default team for the selected competition will be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Edge_TestDefinitions.the_default_team_for_the_selected_competition_will_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be able to logout successfully",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});