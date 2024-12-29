```scala
class MyClass(val name: String) {
  private var _age: Int = 0 // Private mutable variable

  def age: Int = _age
  def age_=(newAge: Int): Unit = {
    if (newAge >= 0) _age = newAge else throw new IllegalArgumentException("Age cannot be negative")
  }
}

object Main extends App {
  val obj = new MyClass("John")
  obj.age = -1 // This line throws an exception
}
```