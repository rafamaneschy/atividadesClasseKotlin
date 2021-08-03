class CalculadoraAposentadoria(private var idade:Int, private var sexo: String, private var anosContribuicao: Int ) {

    fun calcularAposent() {
        if (idade >= 30 && anosContribuicao >= 65 && sexo == "masculino" )
            return print("Verdadeiro")
        else if (idade >= 30 && anosContribuicao >= 60 && sexo == "feminino" )
            return print("Verdadeiro")
        else print("Falso")
    }

}

fun main() {
    val CalculoMaria = CalculadoraAposentadoria(68,"feminino",60)

    CalculoMaria.calcularAposent().toString()

}