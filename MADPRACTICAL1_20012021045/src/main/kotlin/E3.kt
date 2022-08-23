open class Person(firstname:String,lastname:String){
    var age:Int=-1
    init{
        println("First Name:$firstname")
        println("Last Name:$lastname")
    }
    constructor(firstname: String,lastname: String,age:Int):this(firstname,lastname){
        this.age=age
        println("Age $age")
    }
}
class Student(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String):Person(firstname,lastname,age){
    var batch:String=""
    init{
        println("Branch $branch")
        println("Class $Class")
    }
    constructor(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String,batch:String):this(firstname,lastname,age,eno,branch,Class){
        this.batch=batch
        println("Batch $batch")
        println("--------------")
    }

}
fun main(){
    var s1=Student("Keyoori","Rabadia",19,20012021045,"IT","C","AB9")
    var s2=Student("Karm","Patel",20,20012011032,"IT","A","AB7")
    var s3=Student("Kiran","Patel",20,20012021034,"IT","C","AB9")
    var s4=Student("Khyati","Patel",19,20012021071,"CE","C","AB10")
    var s5=Student("Kumkum","Barot",20,20012021067,"CE","A","AB11")

}
