object A {
  def foo(x: Int): Int = x match {
    case 1 => 1
    case _ => 0
  }
}

object B {
  def bar(x: Int): Int = x match {
    case 1 => 1
    case _ => 0
  }
}

val a = new A()
val b = new B()

println(a.foo(1))
println(b.bar(1))