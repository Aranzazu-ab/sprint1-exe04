# LEVEL 1 JUNIT

## EXERCISE 1 UNIT TEST
This Java application implements a simple library management and introduces automated unit testing.
The goal is to develop a testable class and manages a collection of book titles while its behavior is validated through 
unit test.

### STRUCTURE
```text
level1Exe1/
├── Library.java
└── LibraryTest.java
```

**Library**
* `List<String> books`
* `addBook()` with two different parameters.
* `getBook()`
* `deleteBook()`
* `gerSortedBooksAbc()`

**LibraryTest**
* `notNullBookList()`
* `increaseSizeWhenAddBook()`
* `noDuplicatedBooks()`
* `booksKeepInsertionOrder()`
* `getBookPosition()`
* `addBookPosition()`
* `deleteBookTest()`
* `sortedBooksAlphabetical()`

### BEHAVIOUR
The application starts with an empty library and allows books to be added while preserving their insertion order. 
Books can also be inserted at a specific position, retrieved by their index, or removed by title.
To protect the internal collection, the library always returns a copy of the book list instead of the original object. 
It can also return a separate alphabetically sorted copy without modifying the original insertion order.
Duplicate titles are not accepted, ensuring that each book appears only once in the collection.

While developing the project, I intentionally left some methods incomplete to check that the unit tests failed as 
expected. Once the implementation was completed, the tests passed, helping me verify that each feature worked correctly.

### CONCLUSIONS
This exercise provided an introduction to automated testing with JUnit and the importance of validating every feature 
through unit tests.

It also reinforced the use of `ArrayList`, defensive copies, method overloading, and the `Collections.sort()` utility. 
Writing small, independent tests made it easier to verify each requirement and quickly identify errors during development.



