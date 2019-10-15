// ranges
def range = 1..10
println(range.contains(5)) // true
println(range.contains(15)) // false
println(range.size()) // 10
println(range.from) // 1
println(range.to) // 10
println(range.reverse()) // 10 .. 1 range

// list iteration
def digits = [1, 2, 3]
for (digit in digits)
    println(digit)
// using closures
digits.each {entry -> println(entry)}

// for 1 to 10 cycle
for (idx in 1..10)
    println(idx)
// using closures
1.upto(10) {idx -> println(idx)}
