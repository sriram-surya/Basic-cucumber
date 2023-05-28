$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFile/ForgottenPassword.feature");
formatter.feature({
  "name": "To To validate the  functionality of Farfatch",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To valiate the forgotten password page",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to click the forgotten password",
  "keyword": "And "
});
formatter.match({
  "location": "ForgottenPassword.userHasToClickTheForgottenPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to enter the required email id \"sriramsurya97@gmail.com\" and click reset password icon",
  "keyword": "And "
});
formatter.match({
  "location": "ForgottenPassword.userHasToEnterTheRequiredEmailIdAndClickResetPasswordIcon(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFile/Login.feature");
formatter.feature({
  "name": "To validate the login functionality of Farfatch",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate the login page with all credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter the value in username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "mobile number"
      ]
    },
    {
      "cells": [
        "java@gamil.com",
        "surya",
        "java@gamil.com"
      ]
    },
    {
      "cells": [
        "java@gamil.com",
        "surya",
        "java@gamil.com"
      ]
    },
    {
      "cells": [
        "sriramsurya97@gamil.com",
        "surya12397",
        "java@gamil.com"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Farfatch_StepDefinition.userHasToEnterTheValueInUsernameAndPassword(DataTable)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"(//input[@name\u003d\u0027email\u0027])[2]\"}\n  (Session info: chrome\u003d104.0.5112.102)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-4PEI7LP\u0027, ip: \u0027192.168.220.185\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 104.0.5112.102, chrome: {chromedriverVersion: 104.0.5112.79 (3cf3e8c8a07d..., userDataDir: C:\\Users\\sha\\AppData\\Local\\...}, goog:chromeOptions: {debuggerAddress: localhost:63311}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 40fcf385776f78f55a49a505c82df3f3\n*** Element info: {Using\u003dxpath, value\u003d(//input[@name\u003d\u0027email\u0027])[2]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy19.sendKeys(Unknown Source)\r\n\tat org.step.Farfatch_StepDefinition.userHasToEnterTheValueInUsernameAndPassword(Farfatch_StepDefinition.java:89)\r\n\tat ✽.User has to enter the value in username and password(file:src/test/resources/FeatureFile/Login.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user has to click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Farfatch_StepDefinition.userHasToClickTheLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "incorrect login value sholud be shown in the screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Farfatch_StepDefinition.incorrectLoginValueSholudBeShownInTheScreen()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});