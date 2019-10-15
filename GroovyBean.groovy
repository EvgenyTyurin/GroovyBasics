/**
 * Groove classes, GStrings, arrays, maps demo
 * Oct 2019 EvgenyT
 */

// Class (groovy-bean) and code in one source file
class Book {
    String title
}

def book = new Book()

// Autogenerated setter for title property
book.setTitle("Hamlet")
// Autogenerated and shortcutted getter
println(book.title)

// GStrings placeholders demo
def author = "Shakespeare"
println("$author is an author of $book.title")

// x - is an object of Integer class, but we can write x + 1
def x = 1
println(x.plus(1)) // 2
println(x + 1) // 2

// letters is array size of 3
def letters = ['A', 'B', 'C']
println(letters.size()) // 3
// but it can dynamically increase
letters[3] = 'D'
println(letters.size()) // 4

// error is a map
def error = [0: 'OK', 1: 'GENERAL FAILURE', 2: 'UNKNOWN ERROR']
println(error[0]);
error[500] = 'FORMAT C: COMPLETE'
println(error[500])
println(error.size()) // 4
