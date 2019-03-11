Classes cannot be initialized if you make the constructor private, making a class only abstract won't work.

The best solution is to make the constructor private and throw if it's initialized

```java
public class UtilityClass {

    // Suppress default constructor for initializing
    private UtilityClass() {
        throw new AssertionError();
    }
}
```

This also prevents the class from being subclassed.