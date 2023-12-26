class Usuario(val id: Int, val name: String, val email: String) {

    val usuarios = mutableListOf<Usuario>()

    fun adicionar(usuario: Usuario) {
        usuarios.add(usuario)
    }

}
