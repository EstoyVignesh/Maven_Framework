# Maven_Framework

**Ekko Patient Automation – README**

This project contains the Selenium + Java + TestNG automation framework for validating the Ekko Patient Module.
The framework is built using Maven, supports TestNG suite execution, and captures screenshots for success and failure scenarios.

Maven_Framework/
 └── Ekko/
      ├── src/test/java/
      │     └── tests/
      │            └── LoginTest.java
      ├── Ekko.xml                # TestNG Suite File
      ├── Screenshots/            # Execution screenshots
      ├── Reports/                # TestNG/Extent reports (if configured)
      └── pom.xml                 # Maven build file

✅ Prerequisites

Ensure the following are installed before running the automation:

1. Java (JDK 8 or above)

Verify:

java -version

2. Apache Maven

Verify:

mvn -version

3. Eclipse IDE

Required to run TestNG through the XML.

4. TestNG Plugin for Eclipse

Install via Eclipse Marketplace → TestNG for Eclipse.

5. Git Installed

Verify:

git --version
----------------------------------------------------

🔽 **Clone the Repository**


**Option A: Via Eclipse**

Open Eclipse

File → Import → Git → Projects from Git

Select Clone URI

Paste the repository URL

Select the framework branch

Eclipse will automatically import the Maven project
-------------------------------------------------------------------------

**Option B: Using Git Command**

git clone <repository-url>
cd Maven_Framework


Then import into Eclipse:
File → Import → Existing Maven Project

----------------------------------------------------------------------------

⚙️ Maven Setup in Eclipse

After import:

Right-click the project

Select Maven → Update Project

Wait for dependencies to download

If errors appear:
Right-click → Build Path → Configure Build Path

----------------------------------------------------------------------

**🧪 Running the Automation Tests**


▶ **Option 1: Run via TestNG Suite (Recommended)**

Open the Ekko.xml file

Right-click → Run As → TestNG Suite

This will:

Launch the browser

Execute all test methods from LoginTest.java

Capture screenshots in the Screenshots/ folder

Generate TestNG reports
-------------------------------------------------------------------

**▶ Option 2: Run Using Maven Command**

Run the suite through terminal:

mvn clean test -DsuiteXmlFile=Ekko.xml


If pom.xml is preconfigured:

mvn clean test

--------------------------------------------------------------------

📌 Summary

To run the Ekko Patient Automation:

Clone the repo

Import Maven project into Eclipse

Update Maven dependencies

Run Ekko.xml as TestNG suite

View screenshots and reports
