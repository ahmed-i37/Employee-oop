# 🏢 Employee Management System (EMS)

A robust, object-oriented **Employee Management System** implemented in **Java**. This project demonstrates clean architectural design principles by modeling a corporate hierarchy with diverse compensation structures (salaries, bonuses, deductions, and commissions) using advanced **Object-Oriented Programming (OOP)** paradigms.

---

## 🚀 Key Features

* **Hierarchical Domain Modeling:** Leverages class inheritance to decouple generic employee demographics from specialized corporate payroll contracts.
* **Flexible Payroll Schemes:** Comprehensive business logic implementation for calculating corporate payroll dynamically based on fixed monthly salary brackets, performance bonuses, and dynamic deductions.
* **Polymorphic Execution:** Implements standard behavior contracts across different employee definitions via robust interfaces (`Displayable`).
* **Data Encapsulation & Integrity:** Enforces strict mutator and accessor methods (`getters/setters`) to safeguard critical payroll properties and fields.

---

## 🛠️ System Architecture & Design

The codebase relies on a strongly typed core architectural framework structured around code reusability and explicit interface segmentation:


[ Interface: Displayable ]
                              ▲
                              │ (Implements)
                       [  Employee  ] (Abstract/Base Class)
                              ▲
   ┌──────────────────────────┼──────────────────────────┐
   │ (Extends)                │ (Extends)                │ (Extends)


   ### 1. Core Abstractions
* **`Employee`:** The absolute root entity holding unified baseline state fields including Name, Address, Social Security Number (`ssn`), and demographic classification via specialized enums (`Gender`).
* **`Displayable`:** A functional interface decoupled from payroll mechanics, ensuring implementing modules uniformly expose standardized diagnostic outputs (`displayAllDetails()`, `displayEarnings()`).

### 2. Concrete Domain Subclasses
* **`SalariedEmployee`:** Represents payroll profiles receiving contractual monthly fixed compensation, integrated alongside custom calculations supporting dynamic performance `bonus` increments and financial `deduction` penalties.
  * **Payroll Formula:** $Earnings = (Salary + Bonus) - Deduction$

---

## 💻 Technical Implementation Details

The system is developed with a strict focus on modern, idiomatic Java engineering conventions:

* **Language Platform:** Java (JDK 17+)
* **OOP Paradigms Demonstrated:**
  * **Inheritance:** Eliminating redundant property fields by nesting common traits within `super()` context chains (e.g., safely passing parameters up to the parent `Employee` class).
  * **Polymorphism:** Method overriding (`@Override`) of lifecycle calculations such as `aernings()` and data serialization wrappers like `toString()`.
  * **Encapsulation:** Absolute separation of operational visibility states using strict accessibility constraints.

---

## 📦 Getting Started & Execution

### Prerequisites
Make sure you have the Java Development Kit (JDK) installed on your system.

### Compiling the Code
Navigate to your project's root terminal folder containing the source tree and build via:
```bash
javac -d out src/*.java

java -cp out Main
