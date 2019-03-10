## Builder Pattern

Alternatives
- JavaBeans patterns, using setters
- Telescoping, creating multiple constructor iwht optional parameters

The Builder Pattern allows to chain parameters which we want to construct in the constructor in the 
main class.

But the Builder pattern is quite verbose, thus one should use it when there are around 3/4 parameters in the contructor.
Also it has the dis-advantage in performance critical software.

```java
    class Pizza {
        private final int type;
        private final String toppings;
        private final String seasoning;

        private Pizza(Builder builder) {
            this.type = builder.type;
            this.toppings = builder.toppings;
            this.seasoning = builder.seasoning;
        }

        public static class Builder {
            private final int type;
            private String toppings;
            private String seasoning;

            public Builder(int type) {
                this.type = type;
            }

            public Builder toppings(String t) {
                this.toppings = t;
                return this;
            }

            public Builder seasoning(String s) {
                this.seasoning = s;
                return this;
            }

            public Pizza build() {
                return new Pizza(this);
            }
        }
    }
```