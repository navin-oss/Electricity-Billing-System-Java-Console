# ⚡ Electricity Billing System – Java Console Edition

*Created with ❤️ by **Navin OSS***

![Java Badge](https://img.shields.io/badge/Java-Console_Application-orange?logo=java\&logoColor=white)
![OOP Badge](https://img.shields.io/badge/Paradigm-OOP-blue)
![Status Badge](https://img.shields.io/badge/Status-Completed-success)

---

## 🏆 Overview

Welcome to the **Electricity Billing System – Java Console Edition**, a **power-packed, menu-driven utility** designed to replicate the essential workflows of an electricity board’s billing department.

From **adding customers** to **generating bills**, **tracking unpaid invoices**, and **processing payments** — this system does it all with **simplicity, accuracy, and speed**.

**Why this project is awesome:**

* Runs in any terminal — no installation bloat.
* Written with **clean, modular Java code**.
* Perfect example of applying **real-world OOP** concepts.

---

## ✨ Features at a Glance

| Feature                    | Description                                                       |
| -------------------------- | ----------------------------------------------------------------- |
| 📇 **Customer Management** | Add, store, and uniquely identify customers to avoid duplication. |
| 💡 **Bill Generation**     | Auto-generate monthly bills based on readings & billing cycles.   |
| 📜 **Bill History Lookup** | Fetch complete bill details instantly using customer IDs.         |
| ⏳ **Unpaid Bill Tracking** | View & filter unpaid bills (including overdue ones).              |
| 💳 **Payment Recording**   | Update bill payment status in real time.                          |
| 🛠 **Clean Console UI**    | Simple, intuitive menu navigation.                                |

---

## 🧠 Tech Stack & Concepts Used

* **Language**: Java (JDK 8+)
* **Paradigm**: Object-Oriented Programming (OOP)
* **Core Java Concepts**:

  * Classes & Objects
  * Encapsulation
  * Method Overloading
  * Arrays for data handling
* **Error Handling**:

  * Prevent duplicate customer IDs
  * Validate inputs for accuracy
* **Scalability**:

  * Structured to integrate JDBC, Hibernate, or Spring Boot in the future.

---

## 📂 Folder Structure

```
Electricity-Billing-System-Java-Console/
├── src/
│   ├── Bill.java
│   ├── Billingsystem.java    # Main class with menu logic
│   ├── Custmer.java          # (Typo intentional; can be renamed to Customer.java)
│   └── Date.java
├── .gitignore
├── README.md
└── LICENSE
```

---

## ⚙️ How to Compile & Run

**Step 1:** Clone the repository

```bash
git clone https://github.com/<your-username>/Electricity-Billing-System-Java-Console.git
cd Electricity-Billing-System-Java-Console
```

**Step 2:** Navigate to source folder

```bash
cd src
```

**Step 3:** Compile the program

```bash
javac *.java
```

**Step 4:** Run the program

```bash
java Billingsystem
```

---

## 📸 Sample Menu

```
===== Electricity Billing System =====
1. Add New Customer
2. Generate Bill
3. Display Bill Amount
4. View Unpaid Bills
5. Pay Bill
6. View Unpaid Bills by Date
0. Exit
Enter your choice:
```

---

## 🚀 Future Roadmap

* [ ] **Database Support** – MySQL/PostgreSQL for persistent storage
* [ ] **GUI Version** – Swing or JavaFX-based front-end
* [ ] **REST API** – Remote access for billing services
* [ ] **User Authentication** – Admin/operator login system
* [ ] **Detailed Reports** – Consumption patterns & analytics

---

## 📜 License

MIT License — Free to use, modify, and share.

---

## 👨‍💻 Author

**Navin OSS**
📌 GitHub: [@navin-oss](https://github.com/navin-oss)
📧 Email: *[your.email@example.com](mailto:your.email@example.com)*

> *“Code is like electricity — invisible to the eyes, but powerful enough to light up the world.”*

---
