fun main() {
    // objects/instances of Box
    val box1= Box()
    val box2 = Box()

    // Kotlin automatically create a default setter
    box1.height = 7

    // Kotlin automatically create a default getter to access the properties
    println("Box 1 length : ${box1.length}")
    println("Box 1 length : ${box1.width}")
    println("Box 1 length : ${box1.height}")
    println("Box 1 volume : ${box1.volume}")

    box1.open()
    box1.fillContents()
}