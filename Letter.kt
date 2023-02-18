import Mandatory.*
class Letter (_subject: String) : Mandatory (_subject)   {
    var havepen:Boolean = true
    var sparepen:Boolean = true
    var passport:Boolean = true
    var subjectLetter:String = "Indefined"
    var scoreLetter: Byte = 0

    fun HavePenPassport(){
        if(havepen == false){
            println("Студент не допущен до экзаменя из-за не наличия ручки.")
        }
        if(sparepen == false){
            println("Студент не допущен до экзаменя из-за не наличия запасной ручки.")
        }
        if(passport == false){
            println("Студент не допущен до экзаменя из-за не наличия паспорта.")
        }
    }

    fun LetterSubject(){
        println("Предмет необязательного экзамена: $subjectLetter")
    }

    fun ScoreLetter(){
        println("Оценка за необязательный предмет: $scoreLetter")
        when(scoreLetter)
        {
            in 3..5 -> println("Экзамен сдан")
            else -> println("Экзамен не сдан")
        }
    }
}