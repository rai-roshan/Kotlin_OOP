class Box {
    var length: Int = 10
    var width: Int = 20
    var height: Int = 5
    var volume: Int = 0
        get() {
            return length * width * height
        }
        set( value ) {
            field = value * 2
        }


    fun fillContents() {
        println("Box is filled")
    }
    fun open() {
        println("Box Opened")
    }
}