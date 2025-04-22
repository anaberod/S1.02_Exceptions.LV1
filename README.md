# S1.02_Exceptions.LV1
Product and Sale System

📄 Description - Exercise Statement

This exercise involves creating two Java classes: Product and Sale. The Product class represents an individual product with a name and price, while the Sale class represents a sale that can contain multiple products and calculates the total price of the sale.

Additionally, a custom exception, EmptySaleException, is implemented to handle cases when the sale has no products, and an example of handling an IndexOutOfBoundsException is provided.

Objectives:

Implement a Product class with name and price attributes.

Implement a Sale class that holds a collection of products and calculates the total price of the sale.

Implement a custom exception (EmptySaleException) to handle cases where no products are added to the sale.

Demonstrate the handling of an IndexOutOfBoundsException when accessing invalid indices in a collection.

💻 Technologies Used

Java: The primary programming language used to implement the classes and handle exceptions.

JDK 8+: Java Development Kit version 8 or later for compiling and running the Java program.

📋 Requirements

To execute this project, you need the following:

Java 8 or higher: Ensure you have the Java Development Kit (JDK) version 8 or higher installed on your machine.

IDE (Optional): A Java Integrated Development Environment (IDE) like IntelliJ IDEA, Eclipse, or VS Code for editing and running the project.

🛠️ Installation

To set up and run the project locally:

Clone the repository:

Run the following command in your terminal:

bash

git clone https://github.com/anaberod/S1.02_Exceptions.LV1.git

Navigate to the project directory:

bash

cd product-sale-system

Open the project in your preferred IDE (IntelliJ IDEA, Eclipse, etc.) or use a simple text editor.

Ensure Java is installed:

Verify the Java version:

bash

java -version

Compile and Run:

If you are using the terminal, compile and run the Java classes with:

bash

javac Main.java

java Main

▶️ Execution

Once the project is set up, you can execute the program by running the Main.java file. It will demonstrate the functionality of adding products to a sale, calculating the total, and handling exceptions.

Run the program:

In your IDE, simply run the Main.java file.

In the terminal, execute the following:

bash

java Main

The program will first attempt to calculate the total of an empty sale, showing the custom exception message. It will then add products and calculate the total price, demonstrating how the sale total is computed.

🌐 Deployment

To deploy this project in a production or server environment, you can follow these steps:

Package the application:

You can package the Java application into a runnable JAR file using the following command:

bash

jar cf product-sale-system.jar Main.class Product.class Sale.class EmptySaleException.class

Deploy on a server:

Upload the JAR file to your server and run it using:

bash

java -jar product-sale-system.jar

You can also deploy the application in a Java-supported cloud environment.

🤝 Contributions

If you want to contribute to this project, follow these steps:

Fork the repository:

Click on the “Fork” button on GitHub to create a copy of this repository in your own account.

Clone your fork:

Run the following command to clone your forked repository:

bash

git clone https://github.com/anaberod/S1.02_Exceptions.LV1.git

Create a new branch:

Create a new branch for your feature or fix:

bash

git checkout -b feature-branch

Make changes:

Make the desired changes to the code.

Commit and push:

Commit your changes and push them to your forked repository:

bash

git commit -am "Description of your changes"

git push origin feature-branch

Submit a Pull Request:

Submit a pull request (PR) with your changes to the original repository.


