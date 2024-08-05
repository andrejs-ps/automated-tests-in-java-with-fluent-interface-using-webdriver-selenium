## Demo code for my Pluralsight course: Automated Tests in Java with Fluent Interface Using WebDriver Selenium  

Automated UI tests should be easy to read and clearly show business logic, not filled with low-level code. Learn how to create a Fluent Interface for your tests and make them highly readable, easy to maintain and pleasant to work with.

> [!IMPORTANT]
> The topics taught in this course apply to any version of Selenium, including Selenium 4.

You can find all my courses at: https://www.pluralsight.com/authors/andrejs-doronins

## Setup:

### Windows users:

Once you have have cloned the repository, you need to simply take the entire `website` directory and copy it to the root of your `C:\` drive.
This is because the code in `BaseTestClass` attempts to: `driver.get("file:///C:/website/HomePage.html");`

Of course, you can change the path in code. 

### Linux and MacOS users:
I trust you can change the above line to point to wherever you place the `website` directory on your file system.
