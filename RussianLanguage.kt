class RussianLanguage (_subject: String) : Optional (_subject)   {
    var proverkaPen = true
    var oralPart = true
    var sochinenie = true
    var test = true
    var countscore: Byte = 0
    var scoreRussianLanguage: Byte = 0


    fun HavePenOrapartSochTest(){
        if(proverkaPen == false){
            println("Нет ручки в наличие")
        }
        if(oralPart == false)
        {
            println("Устная часть не сдана - экзамен по русскому языку провален")
        }
        if(sochinenie == false){
            println("Сочинение не сдано")
        }
        if(test == false){
            println("Тест не сдан")
        }
    }

    fun CountingScoreRussianLanguage(){
        when(countscore)
        {
            in 8..14 -> scoreRussianLanguage = 3
            in 15.. 18 -> scoreRussianLanguage = 4
            in 19..20->scoreRussianLanguage = 5
            else -> scoreRussianLanguage = 2
        }
    }

    fun ScoreOptionalRussian(){
        println("Оценка за обязательный предмет: $scoreRussianLanguage")
        when(scoreRussianLanguage)
        {
            in 3..5 -> println("Экзамен сдан")
            else -> println("Экзамен не сдан")
        }
    }
}