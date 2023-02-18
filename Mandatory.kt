package Mandatory
import Exam.*
open class Mandatory(_subject: String) : Exam(_subject) {
    var max_score: UByte = 20u
    var pass_score: UByte = 8u
    var admisson: Boolean = false
    var attempts: UByte = 3u

    fun getAdmisson() {
        if (debts == "Да") admisson = false
        else if (debts == "Нет") admisson = true
    }

    fun getExamRetakeMandatory() {
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

    fun getStudentGradeMandatory() {
        if (admisson == false) {

            if (score == max_score) {
                success = "Сдан. Максимальный результат"
                grade = 5u
            } else if (score >= pass_score && score < 65U) {
                success = "Сдан"
                grade = 3u
            } else if (score >= 65U && score < 90U) {
                success = "Сдан"
                grade = 4u
            } else {
                success = "Провален"
                grade = 2u
            }
        }
    }
}