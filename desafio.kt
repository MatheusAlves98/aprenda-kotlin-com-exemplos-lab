// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome:String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(vararg usuarios: Usuario) {
        usuarios.forEach { usuario ->
        	inscritos.add(usuario)
        	println("${usuario.nome} foi matriculado na formação $nome")
        }
    }
}

fun main() {

    val user1 = Usuario("Matheus")
    val user2 = Usuario("Maria")
    val user3 = Usuario("Paulo")
    
    val conteudo1 = ConteudoEducacional("Kotlin")
    val conteudos = mutableListOf<ConteudoEducacional>()
    conteudos.add(conteudo1)
    
    val formacao1 = Formacao("Android", conteudos, Nivel.INTERMEDIARIO)
    formacao1.matricular(user1, user2, user3)
}