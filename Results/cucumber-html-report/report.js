$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/EDGE_Features/Edge_Smoke_Tests_Remote_Chrome_Win10.feature");
formatter.feature({
  "name": "Test Chrome browser on Win10 EDGE smoke test scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test login, competitions, modules, and logout with valid credentials via Chrome on Win10",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Open Chrome on Windows and start Edge application",
  "keyword": "Given "
});
formatter.match({
  "location": "Edge_Remote_Smoke_TestDefinitions.Open_Chrome_on_Windows_and_start_Edge_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "Edge_Remote_Smoke_TestDefinitions.a_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "each competition is selected",
  "keyword": "When "
});
formatter.match({
  "location": "Edge_Remote_Smoke_TestDefinitions.each_competition_is_selected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "each module is selected",
  "keyword": "When "
});
formatter.match({
  "location": "Edge_Remote_Smoke_TestDefinitions.each_module_is_selected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "Edge_Remote_Smoke_TestDefinitions.user_should_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "each module page opens",
  "keyword": "Then "
});
formatter.match({
  "location": "Edge_Remote_Smoke_TestDefinitions.each_module_page_opens()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to logout successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Edge_Remote_Smoke_TestDefinitions.user_should_be_able_to_logout_successfully()"
});
formatter.result({
  "status": "passed"
});
});