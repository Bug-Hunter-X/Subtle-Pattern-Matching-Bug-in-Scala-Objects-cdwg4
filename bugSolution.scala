object A {
  def foo(x: Int): Int = x match {
    case 1 => 1
    case _ => 0
  }
}

//To fix the potential bug, consider using case classes instead of objects if you need to leverage pattern matching features comprehensively.

case class C(x: Int)

object Main {
  def main(args: Array[String]): Unit = {
      val c1 = C(1)
      val c2 = C(2)

      c1 match {
          case C(1) => println("Matched C(1)")
          case _ => println("Did not match C(1)")
      }

      c2 match {
          case C(2) => println("Matched C(2)")
          case _ => println("Did not match C(2)")
      }
  }
} 
