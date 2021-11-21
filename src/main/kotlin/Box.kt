/*
    there are 4 types
    public: default, can be accessed everywhere
    internal: available everywhere in the same module
    private: available only inside the containing class
    protected: same as private but available only inside subclasses or child classes
 */

class Box {
    var length: Int = 10
    var width: Int = 20
    var height: Int = 5
    var volume: Int = 0
        get() {
            return if( field == 0 )
                length*width*height
            else
                field * 2
        }
        private set( value ) {
            field = value * 2
        }

    // can't use setVolume as the function name
    fun setVol(vol: Int ) {
        volume = vol // this will call set method of volume property
    }
    fun fillContents() {
        println("Box is filled")
    }
    fun open() {
        println("Box Opened")
    }
}