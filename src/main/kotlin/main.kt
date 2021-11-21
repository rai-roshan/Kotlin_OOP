fun main() {
    // objects/instances of Box
    val box1= Box()
    val box2 = Box()

    // Kotlin automatically create a default setter
    box1.height = 7

    // Kotlin automatically create a default getter to access the properties
    println("Box 1 length : ${box1.length}")
    println("Box 1 width : ${box1.width}")
    println("Box 1 height : ${box1.height}")
    println("Box 1 volume : ${box1.volume}")

    /* this statement won't work since the getter method is set private
        box1.volume = 10
     */

    box1.setVol(10)
    println("Box 1 volume : ${box1.volume}")

    box1.open()
    box1.fillContents()
}