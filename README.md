# 🧑‍💻 Task S1.08. Java Lambdas and Streams  
**Author:** David Rey  
**Corrected by:** 

## 📄 Description  
This project explores the **Java 8+ Lambdas and Streams API**, applying functional programming concepts to collections, filtering, sorting, and custom functional interfaces. The exercises are organized by difficulty level.

---

### 🔹 Level 1  

**Exercise 1 – Strings Containing 'o'**  
- From a list of `String`, create a method that returns a list of all strings containing the letter `'o'`.  
- Print the result using streams.  

**Exercise 2 – Strings Containing 'o' and Longer than 5 Characters**  
- Extend the previous method to return only strings that contain `'o'` **and** have more than 5 characters.  
- Print the result.  

**Exercise 3 – Months List with Lambda**  
- Create a list with the names of the months of the year.  
- Print all elements of the list using a lambda expression.  

**Exercise 4 – Months List with Method Reference**  
- Repeat the previous exercise but print the elements using a **method reference**.  

**Exercise 5 – Functional Interface for Pi Value**  
- Create a functional interface with a method `getPiValue()` returning a `double`.  
- From the `main()` method, instantiate the interface with a lambda returning `3.1415`.  
- Invoke `getPiValue()` and print the result.  

**Exercise 6 – Sort Strings by Length (Ascending)**  
- Create a list with numbers and text strings.  
- Sort the list from shortest to longest string using a lambda comparator.  

**Exercise 7 – Sort Strings by Length (Descending)**  
- Reuse the previous list and sort it from longest to shortest string.  

**Exercise 8 – Functional Interface for String Reversal**  
- Create a functional interface with a method `reverse(String s)` that returns a `String`.  
- From the `main()` method, inject a lambda that reverses the input string.  
- Invoke the method with a sample string and print the result.  

---

### 🔹 Level 2  

**Exercise 1 – Names Starting with 'A' and Length 3**  
- Create a list of names.  
- Write a method that returns a list of all names starting with `'A'` (uppercase) and having exactly 3 letters.  
- Print the result.  

**Exercise 2 – Even/Odd Number Formatting**  
- Write a method that returns a comma-separated string based on a list of `Integer`.  
- Each element must be prefixed with `"e"` if even, or `"o"` if odd.  
- Example: input `(3, 55, 44)` → output `"o3, o55, e44"`.  

**Exercise 3 – Functional Interface for Operations**  
- Create a functional interface with a method `operation()` returning a `float`.  
- Inject lambdas for addition, subtraction, multiplication, and division.  

**Exercise 4 – Mixed List Transformations**  
- Create a list containing both text strings and numbers. Perform the following operations with lambdas and streams:  
  - Sort alphabetically by the first character (`charAt(0)`).  
  - Sort so that strings containing `"e"` appear first, followed by the rest.  
  - Replace all occurrences of `'a'` with `'4'`.  
  - Show only the elements that are numeric (even if stored as `String`).  

---

### 🔹 Level 3  

**Exercise 1 – Student Filtering with Streams**  
- Create a class `Student` with attributes:  
  - `name` (String)  
  - `age` (int)  
  - `course` (String)  
  - `grade` (double)  
- Fill a list with 10 students.  
- Using lambdas and streams:  
  - Print the `name` and `age` of each student.  
  - Filter students whose name starts with `'a'`, assign them to a new list, and print it.  
  - Filter and print students with a grade ≥ 5.  
  - Filter and print students with a grade ≥ 5 **and** whose course is not `"PHP"`.  
  - Show all students enrolled in `"JAVA"` who are adults (`age >= 18`).  

---

## 💻 Technologies Used  
- Java SE 24  
- IntelliJ IDEA as the development environment  
- Git & GitHub for version control  
- JDK for compiling and running the code  
- Java 8+ Functional Programming:  
  - Lambdas  
  - Streams API  
  - Method references  
  - Functional interfaces  
- OOP Principles:  
  - Class design and encapsulation  
  - Custom functional interfaces  

---

## 📋 Requirements  
- Java Development Kit (JDK) 24 or higher  
- IntelliJ IDEA or any Java-compatible IDE  
- Git installed to clone the repository  
- Basic knowledge of Java 8+ Lambdas and Streams  

---

## 🛠️ Installation  
- Clone the repository:  
```bash
https://github.com/Viid21/S1_08_Lambdas.git
