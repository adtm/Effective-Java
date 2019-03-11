Static Utility classes are inappropriate for classes whose behaviour is parametrized by an underlying resource.
Pass the resource to the constructor when creating a new instance.

```java

public class SpellChecker {

    private final Dictionary dict;

    public SpellCheker(Dictionary dictionary) {
        dict = dictionary;
    }
}

```