class ThreeDBox(length: Int, width: Int, private val height: Int) : Box( length, width) {
    override fun displayDimensions() {
        println("length: ${super.length}")
        println("width: ${super.width}")
        println("height: ${this.height}")
    }
}