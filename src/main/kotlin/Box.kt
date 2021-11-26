/*
    there are 4 types
    public: default, can be accessed everywhere
    internal: available everywhere in the same module
    private: available only inside the containing class
    protected: same as private but available only inside subclasses or child classes
 */

// these are parameter of constructor and not class property
class Box constructor( length: Int, width: Int, height: Int){

    // class properties
    var length: Int
    var width: Int
    var height: Int
    var volume: Int = 0
        get() {
            return if( field == 0 )
                length*width*height
            else
                field
        }
        private set( value ) {  // can't set value from outside the class
            field = value * 2
        }

    // assign the constructor parameters to class property
    init {
        println("===== primary constructor init called")
        this.length = length
        this.width= width
        this.height = height
    }

    // secondary constructor is called if the primary constructor parameters signature doesn't match
    constructor( volume: Int ) : this( 10, 10, 10 ) {
        println("the secondary constructor is called")
        this.volume = volume
    }

    // all initializers are called before the 2nd constructor
    init {
        println("2nd initializer is called")
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
        println("width: ${this.width}")
        println("length: ${this.length}")
        println("height: ${this.height}")
        println("volume: ${this.volume}")
    }
}