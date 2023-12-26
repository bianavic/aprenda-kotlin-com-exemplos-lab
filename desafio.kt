fun main() {

    val usuario1 = Usuario(1, "Lugano", "lugano@email.com")
    val usuario2 = Usuario(2, "Gonzales", "gonzales@email.com")
    val usuario3 = Usuario(3, "Nero", "nero@email.com")

    val usuarios = Usuario(0, "", "")
    usuarios.adicionar(usuario1)
    usuarios.adicionar(usuario2)
    usuarios.adicionar(usuario3)

    val formacao1 =
        Formacao(
            1, "Java Básico", listOf(
                ConteudoEducacional("Introdução ao Java", 60),
                ConteudoEducacional("Orientação a Objetos", 120),
                ConteudoEducacional("Programação Funcional", 180)
            )
        )

    formacao1.definirNivel(Nivel.BASICO)

    val formacao2 =
        Formacao(
            2, "Padroes de Projeto", listOf(
                ConteudoEducacional("Singleton", 60),
                ConteudoEducacional("Builder", 120),
                ConteudoEducacional("Adapter", 100),
                ConteudoEducacional("Extension Function", 120),
                ConteudoEducacional("Processamento Paralelo/Assincrono", 120)
            )
        )

    formacao2.definirNivel(Nivel.INTERMEDIARIO)

    val formacao3 =
        Formacao(
            3, "Spring Framework", listOf(
                ConteudoEducacional("Data", 60),
                ConteudoEducacional("Security", 120),
                ConteudoEducacional("HATEOAS", 100),
                ConteudoEducacional("Cloud", 120),
                ConteudoEducacional("Session", 120)
            )
        )

    formacao3.definirNivel(Nivel.AVANCADO)

    println()
    println("A DIO possui 3 formações: ${formacao1.nome}, ${formacao2.nome} e ${formacao3.nome}")
    println()

    println("${formacao1.nome} é do nivel ${formacao1.nivel} e possui ${formacao1.conteudos.size} conteúdos educacionais")
    println("Os usuários matriculados na Formação ${formacao1.nome} são: ${usuario1.name} e ${usuario2.name}")
    println()

    println("${formacao2.nome} é do nivel ${formacao2.nivel} e possui ${formacao2.conteudos.size} conteúdos educacionais")
    println("Os usuários matriculados na Formação ${formacao2.nome} são: ${usuario1.name} e ${usuario3.name}")
    println()

    println("${formacao3.nome} é do nivel ${formacao3.nivel} e possui ${formacao3.conteudos.size} conteúdos educacionais")
    println("O usuário matriculado na Formação ${formacao3.nome} é: ${usuario3.name}")

}
