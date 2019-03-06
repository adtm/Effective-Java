class Pizza {
    private final int type;
    private final String toppings;
    private final String seasoning;

    public String toString() {
        return this.type + " " + this.toppings + " " + this.seasoning;
    }

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