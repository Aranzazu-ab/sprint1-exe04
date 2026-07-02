# LEVEL 1 JUNIT

## EXERCISE 1 UNIT TEST

This Java application implements a simple library management and introduces automated unit testing.
The goal is to develop a testable class and manages a collection of book titles while its behavior is validated through 
unit test.

### STRUCTURE
```text
L1Exe1/
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
L1Exe2/
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

## EXERCISE 3 EXCEPTION CONTROL

This Java application demonstrates exception handling and introduces unit testing focused on verifying that expected 
exceptions are correctly thrown. The goal is to understand how to manage expected errors through automated testing, 
ensuring that invalid operations are detected and properly signaled.


### STRUCTURE
```text
L1Exe3/
├── ArrayException.java
└── ArrayExceptionTest.java
```

**ArrayException**
* `List<Integer> arrayInt`
* `trowException()`

**ArrayExceptionTest**
* `invalidIndex()`

### BEHAVIOUR
The application starts with a fixed collection of integers stored internally. It exposes a method that checks whether
a given position is valid within the bounds of the collection.
When an out-of-range position (negative or greater than or equal to the collection size) is provided, the method
throws an `ArrayIndexOutOfBoundsException`, simulating an invalid access attempt to a non-existent element.
The unit test verifies this behavior by calling the method with a position outside the valid range and confirming
that the expected exception is thrown, using JUnit 5's `assertThrows()`.
While developing the exercise, I made sure the exception was thrown only under the correct invalid conditions, when I 
try for example, `arrayException.throwException(1)` the test failed:
Output:
org.opentest4j.AssertionFailedError: Expected java.lang.ArrayIndexOutOfBoundsException to be thrown, but nothing was thrown.

### CONCLUSIONS
This exercise provided an introduction to exception handling in Java and how to validate it through automated testing.
And reinforced the use of `assertThrows()` to check expected exceptions, the importance of defining clear boundary
conditions. Writing a test specifically for the failure scenario helped confirm that the exception logic behaved exactly 
as intended.

# LEVEL 2 ASSERTJ

This Java application introduces AssertJ, a fluent assertion library that provides more expressive and readable
assertions than plain JUnit. Each exercise focuses on a different AssertJ feature, covering equality, object
references, arrays, collections, maps, exceptions, and Optional values.

### STRUCTURE
```text
L2/
├── Amphibian.java
├── Fish.java
├── Mammals.java
├── Reptiles.java
└── Level2Test.java
```
`ArrayException.java` is not duplicated in this package. The exception test in this level reuses the `ArrayException` 
class already implemented in level1Exe3.

**Amphibian/Fish/Mammals/Reptiles**
* `String name`
* Constructor to store names.

**Level2Test**
* `integerEqual()`
* `integerNotEqual()`
* `sameOrNotSameMemoryReference()`
* `identicalArrays()`
* `testArrayListOrder()`
* `mapContainsKey()`
* `invalidIndex()`
* `emptyOptional()`

### BEHAVIOUR
The test class validates several independent scenarios using AssertJ's fluent syntax instead of standard JUnit
assertions.

Integer values are compared using `isEqualTo()` and `isNotEqualTo()` to confirm equality and inequality between
wrapped objects. 
Object identity is checked with `isSameAs()` and `isNotSameAs()`, demonstrating the difference
between reference equality and value equality, since two String objects created independently are equal in
content but not in memory reference.
Two integer arrays with identical elements are compared with `containsExactly()` to confirm they hold the same
values in the same order.
An ArrayList containing different animal subtypes (Amphibian, Fish, Mammals, Reptiles) is used to test
several collection assertions: `containsExactly()` verifies the same insertion order, `containsExactlyInAnyOrder()` 
confirms that got the same elements regardless of order, `containsOnlyOnce()` checks that an element appears exactly 
once, and `doesNotContain()` confirms that an object never added to the list is correctly absent.
A HashMap is used to verify that a specific key exists using `containsKey()`.
The exception scenario reuses the ArrayException class from Level 1 to trigger an `ArrayIndexOutOfBoundsException`, 
and AssertJ's `assertThatThrownBy()` is used to verify both, the exception type with `isInstanceOf()` and the exception 
message with `hasMessageContaining()`.
Finally, an empty Optional<String> is validated using `isEmpty()`.

### CONCLUSIONS
This exercise provided an introduction to AssertJ and its fluent, readable assertion style compared to standard
JUnit assertions. It also reinforced the difference between value equality and reference equality, collection 
assertions with different ordering guarantees, map key verification, exception assertions with message validation, and 
handling of Optional values. 