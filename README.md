
# Cucumber Automation Framework
## Basic Knowledge
1. Java
2. [Maven](https://maven.apache.org/download.cgi)
3. [AssertJ](https://joel-costigliola.github.io/assertj/)

### Maven Setup
1. Download Maven binary folder
2. Place the folder under `/opt/` directory
3. Edit your `.bash_profile` file to add the MAVEN_HOME
```
export MAVEN_HOME=/opt/apache-maven-3.6.0/bin
export PATH=$PATH:$MAVEN_HOME
```

## Automation Parent
1. Clone the repository [**`automation-test-parent`**](https://github.com/dvillalobosIM/automation-test-parent)
2. Open a terminal and navigate to the root folder of the project, then execute the following command:
``` console
mvn clean install -Dreporting.skip=true
```
3. Wait until get in console the :
``` console
[INFO] -------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] -------------------------------------------------------
```

## Maven project
1. Create a new Maven project
2. In `pom.xml`file add a parent pom.
```xml
<parent>
    <groupId>com.identitymind.automation.test</groupId>
    <artifactId>automation-test-parent</artifactId>
    <version>1.0-SNAPSHOT</version>
</parent>
```

## Cucumber
Open source tool tests business-readable specifications against your code on any modern development stack.

## Gherkin Syntax
* Feature
* Scenario
* Given, When, Then, But
* Examples

## Cucumber Expressions
Sentence : `I have 42 cucumbers in my belly` </br>
Match expression : `I have {int} cucumbers in my belly`

### Parameter Types
|Type|Examples|
|----|--------|
|{int}|`1`, `-10`|
|{float}|`.8`, `3.8`, `-9.4`|
|{word}|`banana` but not `banana split`|
|{string}|`"any words double-quoted"`, `'or single-quoted'`|
|{}|Matches anything `/.*/`|

### Custom Parameter Types
`I have a {color} ball`</br>
To add `{color}` we can use typeRegistry to define new parameter.</br>
``` java
typeRegistry.defineParameterType(new ParameterType<>(
    "color",           // name
    "red|blue|yellow", // regexp
    Color.class,       // type
    Color::new         // transformer function
))
```

## Feature Files
In Cucumber, an example is called a scenario. Scenarios are defined in `.feature` files, which are commonly stored in the src/test/resources directory (or a subdirectory).
``` gherkin
Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Scenario: Sunday isn't Friday
    Given today is Sunday
    When I ask whether it's Friday yet
    Then I should be told "Nope"
```

## Dependency Injection
Pass variables between classes (Hooks-Test Steps)

## Reports
* Pretty/json
* html
* junit/xml
