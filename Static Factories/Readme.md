##Static Factory Methods

```javascript
    class Coordinate {
      private static final MAX_COORDINATE = new Coordinate(100,100)
      private Coordinate(x: Int, y: Int) {
        this.x = x;
        this.y = y;  
      }
      
      static final fromXY(x: Int, y: Int) new Coordinate(x, y)
      static final getMax MAX_COORDINATE
    }
    Coordinate.getMax === Coordinate.getMax
    Coordinate.fromXY(10, 10)
```

1. Allows to create new objects without overloading constructors and giving names to methods.
2. Can cache values and not create new instances every-time
3. Static methods can return any type of object without making their classes public
4. The return object can vary dependant on the input parameters
5. ??? 

Negatives

1. Classes with private constructors cannot be extended 
2. Static methods are harder to find for programmers

