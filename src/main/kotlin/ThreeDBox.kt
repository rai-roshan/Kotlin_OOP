// only height is the property of this class
// length and width are just the primary constructor parameter
class ThreeDBox(length: Int, width: Int, private val height: Int) : Box( length, width) {
    override fun displayDimensions() {
        println("length: ${super.length}")
        println("width: ${super.width}")
        println("height: ${this.height}")
    }
}