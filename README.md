# Subtle Pattern Matching Bug in Scala Objects

This repository demonstrates a subtle bug related to pattern matching in Scala when dealing with objects instead of case classes.  The issue highlights a difference in behavior that can lead to unexpected or incorrect results. 

## Bug Description
The code in `bug.scala` defines two objects, `A` and `B`, each with a method (`foo` and `bar` respectively) that uses pattern matching on an integer input. Although the pattern matching logic appears identical, the outcome differs, demonstrating the subtle difference in how pattern matching works in objects.

## Solution
The solution is outlined in `bugSolution.scala` which might involve restructuring your code to use case classes instead of objects, or explicitly handling potential issues related to object equality when using pattern matching.

## How to Reproduce
1. Clone this repository.
2. Compile and run `bug.scala` using a Scala compiler (e.g., `scalac bug.scala` and `scala bug`). Observe the output.
3. Compare the output with the expected behavior and the solution in `bugSolution.scala`.