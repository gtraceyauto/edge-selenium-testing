$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/EDGE_Features/Edge_Smoke_Tests_Remote_Chrome_MacOS.feature");
formatter.feature({
  "name": "Test Chrome browser on MacOS EDGE smoke test scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test login, competitions, modules, and logout with valid credentials via Chrome on MacOS",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Open Chrome on MacOS and start Edge application",
  "keyword": "Given "
});
formatter.match({
  "location": "Edge_Remote_Smoke_TestDefinitions.Open_Chrome_on_MacOS_and_start_Edge_application()"
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
  "error_message": "org.openqa.selenium.WebDriverException: java.net.ConnectException: Connection refused\nCommand duration or timeout: 0 milliseconds\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteNavigation.to(RemoteWebDriver.java:853)\r\n\tat EDGE_Remote_stepDefinitions.Edge_Remote_Smoke_TestDefinitions.a_valid_username_and_password(Edge_Remote_Smoke_TestDefinitions.java:156)\r\n\tat ✽.a valid username and password(src/EDGE_Features/Edge_Smoke_Tests_Remote_Chrome_MacOS.feature:6)\r\nCaused by: org.openqa.selenium.WebDriverException: java.net.ConnectException: Connection refused\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:05:20.749Z\u0027\nSystem info: host: \u0027DESKTOP-GLCVP50\u0027, ip: \u0027192.168.0.34\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.remote.server.WebDriverServlet.lambda$handle$3(WebDriverServlet.java:255)\r\n\tat org.openqa.selenium.remote.server.WebDriverServlet$$Lambda$77/488332897.run(Unknown Source)\r\n\tat java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)\r\n\tat java.util.concurrent.FutureTask.run(FutureTask.java:266)\r\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)\r\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)\r\n\tat java.lang.Thread.run(Thread.java:745)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "each competition is selected",
  "keyword": "When "
});
formatter.match({
  "location": "Edge_Remote_Smoke_TestDefinitions.each_competition_is_selected()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "each module is selected",
  "keyword": "When "
});
formatter.match({
  "location": "Edge_Remote_Smoke_TestDefinitions.each_module_is_selected()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "Edge_Remote_Smoke_TestDefinitions.user_should_be_able_to_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "each module page opens",
  "keyword": "Then "
});
formatter.match({
  "location": "Edge_Remote_Smoke_TestDefinitions.each_module_page_opens()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be able to logout successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Edge_Remote_Smoke_TestDefinitions.user_should_be_able_to_logout_successfully()"
});
formatter.result({
  "status": "skipped"
});
});