class Pizza {
    
    private type: number;
    private toppings: String;
    private seasoning: String;

    private constructor(builder) {
        this.type = builder.type;
        this.toppings = builder.toppings;
        this.seasoning = builder.seasoning;
    }

    static get Builder() {
        class Builder {
            
            private type: number;
            private seasoning: String = "";
            private toppings: String = "";

            constructor(type: number) {
                this.type = type;
            }

            setSeasoning(s: String) {
                this.seasoning = s;
                return this;
            }

            setToppings(s: String) {
                this.toppings = s;
                return this;
            }

            build() {
                return new Pizza(this);
            }
        }
        return Builder;
    }
}

const pizza = new Pizza.Builder(4).setToppings("Ham").build();
console.log(pizza)