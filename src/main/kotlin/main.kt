fun main() {
    // this calls the primary constructor and set the length, width, and height
    val box1= Box(12, 12, 12)
    // this calls the secondary constructor and set volume
    val box2 = Box(70)


    box1.open()
    box2.open()
}