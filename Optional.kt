import Exam.*
open class Optional(_subject: String) : Exam (_subject)  {
    var max_score: UByte = 100u
    var pass_score: UByte = 45u
    var admisson: Boolean = false
    var attempts: UByte = 3u

    fun getAdmisson() {
        if (debts == "Да") admisson = false
        else if (debts == "Нет") admisson = true
    }

    fun getExamRetakeOptional() {
        if (success == "Не сдано"){
            if (day + 7u > 31u){
                day = (day - 31u + 7u).toUByte()
                if (month++ > 12u){
                    month = 1u
                    this.year++
                    println("Дата пересдачи $day/$month/$year")
                }
                else this.month++
                println("Дата пересдачи $day/$month/$year")
            }
            else println("Дата пересдачи $day/$month/$year")
        }
    }

    fun getStudentGradeOptional() {
        if (success == "Failed"){
            if (day + 7u > 31u){
                day = (day - 31u + 7u).toUByte()
                if (month++ > 12u){
                    month = 1u
                    this.year++
                    println("Your retake date is $day/$month/$year")
                    this.attempts = attempts--
                }
                else this.month++
                println("Your retake date is $day/$month/$year")
                this.attempts = attempts--
            }
            else println("Your retake date is $day/$month/$year")
            this.attempts = attempts--
        }
    }

}