open class Box(val length: Int, val width: Int) {    // primary constructor with initialization of class property
    open fun displayDimensions() {
        println("length : ${this.length}")
        println("width : ${this.width}")
    }
}