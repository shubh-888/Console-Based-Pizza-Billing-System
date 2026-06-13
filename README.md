# 🍕 Console-Based Pizza Billing System

A Java-based console application that simulates a real-world pizza ordering and billing system. The project is built using Object-Oriented Programming (OOP) principles and provides an interactive menu-driven experience for customers.

---

## 🚀 Features

* 🥬 Order Veg Pizza
* 🍗 Order Non-Veg Pizza
* 🌟 Order Deluxe Veg Pizza
* 🌟 Order Deluxe Non-Veg Pizza
* 🧀 Add Extra Cheese
* 🍄 Add Extra Toppings
* 📦 Add Takeaway Packaging
* 🧾 Automatic Bill Generation
* 🎯 Interactive Console-Based Menu
* 🔒 Prevention of Duplicate Charges

---

## 🛠️ Tech Stack

* Java
* Object-Oriented Programming (OOP)
* IntelliJ IDEA
* Git & GitHub

---

## 📚 OOP Concepts Implemented

### Encapsulation

Used private fields to protect pizza data and pricing information.

### Inheritance

`DeluxePizza` extends the `Pizza` class to reuse existing functionality.

### Method Overriding

Deluxe pizzas already include cheese and toppings, so related methods are overridden.

### Polymorphism

Used:

```java
Pizza pizza = new DeluxePizza(true);
```

to demonstrate runtime polymorphism.

### Constructor Chaining

Used `super()` to initialize parent class properties.

---

## 📂 Project Structure

```text
Console-Based-Pizza-Billing-System
│
├── src
│   ├── Main.java
│   ├── Pizza.java
│   └── DeluxePizza.java
│
├── README.md
└── .gitignore
```

---

## 🎮 Sample Output

```text
╔══════════════════════════════════════════╗
║      🍕 WELCOME TO SHUBHAM PIZZA 🍕      ║
╚══════════════════════════════════════════╝

🥬 1. Veg Pizza              ₹300
🍗 2. Non-Veg Pizza          ₹400
🌟 3. Deluxe Veg Pizza       ₹450
🌟 4. Deluxe Non-Veg Pizza   ₹550

👉 Select your pizza (1-4): 2

🧀 Add Extra Cheese (+₹100)? (Y/N): Y
🍄 Add Extra Topping (+₹50)? (Y/N): Y
📦 Add Takeaway Packaging (+₹25)? (Y/N): Y

🔄 Preparing Your Pizza...
🔥 Baking...
🧑‍🍳 Adding Fresh Toppings...
🍕 Pizza Ready!

💰 Total Bill : ₹575
```

---

## 💡 Key Learnings

* Designing menu-driven applications
* Applying OOP concepts in real-world scenarios
* Implementing inheritance and polymorphism
* Writing reusable and maintainable Java code
* Managing source code using Git and GitHub

---

## 🔮 Future Enhancements

* MySQL Database Integration
* Order History Management
* Multiple Pizza Sizes
* Coupon & Discount System
* GST Calculation
* GUI using Java Swing/JavaFX
* Spring Boot Backend Version

---

## 👨‍💻 Author

**Shubham Maddhesiya**

* GitHub: https://github.com/shubh-888
* LinkedIn: https://www.linkedin.com/in/shubham-maddhesiya-bb0031314/

---

⭐ If you found this project useful, don't forget to give it a star!
