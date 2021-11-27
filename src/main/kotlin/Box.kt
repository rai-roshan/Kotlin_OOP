// abstract class means we can't create instances of it
// it can and cannot have member implementation
abstract class Box(val length: Int, val width: Int) {    // primary constructor with initialization of class property
    // not implemented member , they are defined as abstract
    abstract fun displayDimensions()
    // implemented member
    fun testClass() {
        println("Box class is working")
    }
}