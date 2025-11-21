class PizzaKazan(
    neapolitanPizzaPrice: Double,
    romanPizzaPrice: Double,
    sicilianPizzaPrice: Double,
    tyroleanPizzaPrice: Double
) : PizzaCity(neapolitanPizzaPrice, romanPizzaPrice, sicilianPizzaPrice, tyroleanPizzaPrice),Sauce {
    override fun neapolitanPizzaSale() {
        neapolitanPizzaCount++
        println("Спасибо за покупку неаполитанской пиццы в Казани")
    }
    override fun romanPizzaSale() {
        romanPizzaCount++
        println("Спасибо за покупку римской пиццы в Казани")
    }
    override fun sicilianPizzaSale() {
        sicilianPizzaCount++
        println("Спасибо за покупку сицилийской пиццы в Казани")
    }
    override fun tyroleanPizzaSale() {
        tyroleanPizzaCount++
        println("Спасибо за покупку тирольской пиццы в Казани")
    }

    override fun sauceSale() {
        println("\nВы хотите добавить соус к пицце?")
        println("1. Чесночный соус ($garlicSaucePrice руб.)")
        println("2. Сырный соус ($cheeseSaucePrice руб.)")
        println("3. Нет, спасибо")

        when (readln()) {
            "1" -> {
                garlicSauceCount++
                println("Отличный выбор! Чесночный соус добавлен")
            }
            "2" -> {
                cheeseSauceCount++
                println("Отличный выбор! Сырный соус добавлен")
            }
            "3" -> println("Хорошо")
            else -> println("Некорректный выбор, соус не добавлен")
        }
    }
}