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


## EXERCISE 2 PARAMETERIZED TEST

This Java application implements a simple DNI letter calculator and introduces parameterized testing with JUnit.
The goal is to validate the same functionality using multiple input values while ensuring that invalid DNI numbers 
are correctly handled through exceptions.

### STRUCTURE
```text
level1Exe2/
├── CalculateDni.java
└── CalculateDniTest.java
```

**CalculateDni**
* `int numDni`
* `calculateLetter()`

**CalculateDniTest**
* `calculateLetterTest()`
* `negativeDni()`
* `longestDni()`

### BEHAVIOUR
The application calculates the correct letter for a Spanish DNI by applying the official modulo 23 algorithm and 
selecting the corresponding character from the predefined sequence of letters.
The parameterized test validates the calculation using ten different DNI numbers, allowing the same test method 
to be executed with multiple sets of data and reduces duplicated code and makes the tests easier to maintain.

The application also validates invalid input values. Negative numbers or numbers larger than the maximum valid DNI 
throw an IllegalArgumentException, ensuring that incorrect data is handled properly.

While developing the exercise, I verified the accuracy of the parameterized tests by correcting invalid expected values 
and confirming that failing tests accurately reflected incorrect test data rather than errors in the implementation.
For example, `"12344321, R"`
Output:
Expected :Z
Actual   :R
<Click to see difference>

### CONCLUSIONS

The use of @ParameterizedTest and @CsvSource, makes possible to validate many input values with a single test method.
And it also reinforced exception handling by testing invalid input values and confirmed the importance of writing 
reliable test data. Parameterized tests proved to be a clean and efficient way to validate repetitive scenarios 
while keeping the test code concise and easy to read.
