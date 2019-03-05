
class Coordinates private (val x: Int, val y: Int) {
    override def toString = s"$x - $y"
}

object Coordinates {
    private final val maximumCoordinates = new Coordinates(100, 100)

    def maximum = maximumCoordinates
    def getCoordinates(x: Int, y: Int) = new Coordinates(x, y)
    def doubledCoordinates(x: Int, y: Int) = new Coordinates(x * 2, y * 2)
}


object Main extends App {

    val coord1 = Coordinates.doubledCoordinates(4, 10)
    val coord2 = Coordinates.getCoordinates(10, 4)
    
}