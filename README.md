TestOnlineStore Project 🛒
Project Overview 📦
Welcome to the TestOnlineStore project! This is a simple Java-based online store simulation that allows customers to create an account, place orders, apply discounts, and calculate the total cost including tax. This project provides a great example of using Java for building a console-based shopping system with user interaction through JOptionPane.

Tech Stack 💻
Programming Language: Java 🟩
GUI Library: JOptionPane for user interface (Pop-up dialogs) 🖥️
Date & Time: LocalDate and LocalTime for tracking order date and time 🗓️⏰
Random Number Generation: Random class for product pricing 🔢
Features 🌟
1. Customer Registration 📝
Customers are prompted to enter their details (Name, Surname, ID, Phone Number, Email, Address).
Validation: The program ensures no fields are left empty during registration.
Edit Options: Customers can modify any of their details before proceeding.
2. Order Products 🛍️
Customers can order up to 5 different products.
Product prices are randomly generated between 1 and 1000 using the Random class.
Order details, including product name and price, are displayed.
3. Discounts 💸
Discount Tiers: Discounts are applied based on the number of products ordered.
1-5 Products: No discount
6-10 Products: 10% discount
11-15 Products: 14% discount
And so on…
Dynamic Calculation: The system calculates and applies the discount to the total price.
4. Order Summary 📊
After the customer places their order, a summary is shown with:
Customer Details (Name, Surname, ID, Phone, Email, Address)
Order Details (Product ID, Date, Time, Total Price, Discount, Tax)
5. Real-time Date and Time 🕒
The program tracks the current date and time of the order using Java's LocalDate and LocalTime classes.
Project Files 📂
1. Main File: TestOnlineStore.java
The main logic of the online store is implemented here.
Handles customer registration, order processing, and price calculations.
Uses JOptionPane to interact with the user through pop-up dialogs.
2. Supporting Class: Store.java
Represents the customer's order and personal data.
Stores customer details such as name, surname, ID number, and order details like product ID.
How to Run 🚀
Prerequisites: Make sure you have Java installed on your system.
Clone/Download the project repository to your local machine.
Open the project in your favorite IDE (e.g., IntelliJ IDEA, Eclipse).
Run the TestOnlineStore.java file to start the program.
Usage Instructions 🛠️
Step 1: Customer Registration 📝
Upon running the program, you'll be prompted to enter your details (Name, Surname, etc.).
After entering the details, you will have an option to verify or edit your information.
Step 2: Order Products 🛒
Once logged in, you'll be able to enter the products you wish to order.
You can place an order for up to 5 different products.
Each product is assigned a randomly generated price.
Step 3: Apply Discount 💸
After placing the order, the system will apply a discount based on the number of products ordered.
The final price is calculated after applying the discount and tax.
Step 4: View Order Summary 📊
You’ll be shown a summary of the order, including:
Customer and order details
Total cost, discount applied, and tax
Important Notes ⚠️
Discount Ranges:

The discount is determined by the number of products ordered.
Available discount percentages: 0%, 10%, 14%, 28%, 30%.
Price Generation:

Product prices are randomly generated between R1 and R1000 using the Random class.
Date and Time:

The current date and time of the order will be recorded.
Possible Improvements 🔧
Database Integration: Store customer and order data in a database for persistent storage.
Improved User Interface: Move from JOptionPane to a more advanced GUI using libraries like JavaFX or Swing.
Advanced Features: Implement features like product categories, payment processing, or order history.
