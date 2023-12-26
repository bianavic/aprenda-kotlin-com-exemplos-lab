data class Formacao(val id: Int, val nome: String, val conteudos: List<ConteudoEducacional>) {

    var nivel: Nivel = when (conteudos.size) {
        1 -> Nivel.BASICO
        2 -> Nivel.INTERMEDIARIO
        else -> Nivel.AVANCADO
    }

    fun definirNivel(nivel: Nivel) {
        this.nivel = nivel
    }

}