// Flow control

// If / Else
if (1 > 3) println("Impossible!") else println("The world makes sense")

if (1 > 3) {
  println("Impossible!")
  println("Really?")
} else {
  println("The world makes sense.")
  println("Still.")
}

// Matching
val number = 30
number match {
  case 1 => println("One")
  case 2 => println("Two")
  case 3 => println("Three")
  case _ => println("Something else")
}

// For loops
for (x <- 1 to 4) {
  val squared = x * x
  println(squared)
}

var x = 10
while (x >= 0) {
  println(x)
  x -= 1
}

x = 0
do { println(x); x+=1} while (x <= 10)

// Expressions

{val x = 10; x + 20}

println({val x = 10; x + 20})

// EXERCISE
// Write some code that prints out the first 10 of the Fibonacci sequence
// Every number is the sum of the 2 numbers before it
// 0,1,1,2,3,5,8,13,21,34

var x = 0
var y = 0
var z = 1
while (x < 10) {
  if (x % 2 == 0) {
    println(y)
    y += z
  }
  else {
    println(z)
    z += y
  }
  x += 1
}
