open class Lokomotivy (var _nazvanie:String, var _model:String, var _skorost:Double, var _stoimost:Double) {
    val nazvanie:String
    init{
        nazvanie = _nazvanie
    }
    val model:String
    init{
        model = _model
    }
    val skorost:Double
    init{
        skorost = _skorost
    }
    val stoimost:Double
    init{
        stoimost = _stoimost
    }

    open fun Info() {
        println("Модель: $model")
        println("Название: $nazvanie")
        println("Максимальная скорость: $skorost")
        println("Стоимость производства: ${raschet_stoimost()}")
    }

    open fun raschet_stoimost(){
        if (model == "2ЭС6" || nazvanie == "Грузовой электровоз 2ЭС6 \"СИНАРА\""){
            println("93'925'000")
        }
        if (model == "ЭС104" || model == "ФИНИСТ" || nazvanie == "Электропоезд ЭС104 \"ФИНИСТ\""){
            println("100'424'242")
        }
        if (model == "2ЭС10" || model == "ГРАНИТ" || nazvanie == "Грузовой электровоз 2ЭС10 \"ГРАНИТ\""){
            println("55'255'000")
        }
        if (model == "ЛАСТОЧКА" || nazvanie == "Электропоезд \"Ласточка\""){
            println("120'000'00")
        }
    }
}