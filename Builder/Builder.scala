
case class Builder(val seasoning: String, val toppings: String)
class Pizza extends Builder

val pizza = new Pizza(toppings = "Ham", seasoning = "Pepper")
