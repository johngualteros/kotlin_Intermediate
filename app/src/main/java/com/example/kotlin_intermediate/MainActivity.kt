package com.example.kotlin_intermediate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.collections.ArrayList
import kotlin.concurrent.thread

typealias MyMapList = MutableMap<Int, ArrayList<String>>
typealias  MyFun = (Int, String, MyMapList) -> Boolean
typealias  MyNestedClass = MyNestedAndInnerClass.MyNestedClass
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //enumClasses()
        //nestedAndInnerClasses()
        //classInheritance()
        //interfaces()
        //visibilityAndModifiers()
        //dataClasses()
        //aliases()
        //destructuring()
        //extensions()
        lambdas()
    }
    enum class Direction(val dir:Int){
        NORTH(1), SOUTH(-1), EAST(1), WEST(-1);

        fun description() : String{
            return when(this){
                NORTH -> "the direction is North"
                SOUTH -> "the direction is South"
                EAST -> "the direction is East"
                WEST -> "the direction is West"
            }
        }
    }
    private fun enumClasses(){
        var userDirection: Direction? = null

        userDirection = Direction.SOUTH
        println("Direction User is :  $userDirection")

        println("Property name: ${userDirection.name}")
        println("Ordinal is ${userDirection.ordinal}")
        println(userDirection.description())
        println(userDirection.dir)
    }
    private fun nestedAndInnerClasses(){
        val myNestedClass = MyNestedClass()
        val sum:Int = myNestedClass.sum(9,13)

        val myInnerClass = MyNestedAndInnerClass().MyInnerClass()
        val sum2 = myInnerClass.sumTwo(11)
    }
    private fun classInheritance(){
        val programmer = Programmer("John",17, "Java")
        programmer.work()
        programmer.sayLanguaje()
    }
    private fun interfaces(){
        val gamer = Person("John",17)
        gamer.play()
        gamer.stream()
    }
    private fun visibilityAndModifiers(){
        //val visibility = Visibility()
        //visibility.name = "John"
        //visibility.sayMyName()
    }
    private fun dataClasses(){
        val john = Worker("john",17,"Programmer")
        john.lastWork = "Nothing"

        val sara = Worker()

        if (john.equals(sara)){
            println("Yes is equals")
        }else{
            println("Not is equals")
        }
        println(john.toString())
        val john2 = john.copy(age = 18)

        val (name,age) = john
        println(name)
        println(age)
    }
    private var myMap: MyMapList = mutableMapOf()
    private fun aliases(){
        var myNewMap : MyMapList = mutableMapOf()
    }
    private fun destructuring(){
        val (name,_,work) = Worker("Juan",21,"Designer Graphic")
        println("$name $work")

        val (nameJule,ageJule,workJule) = myWorker()
        val myMap = mapOf(1 to "John", 2 to "Daniela")

        for ((key,value) in myMap){
            println("$key : $value")
        }
    }
    private fun myWorker() :Worker {
        return Worker("Jule" ,28,"Marketing")
    }
    private fun extensions(){
        val myDate = Date()
        myDate.customFormat()
        myDate.formatSize
        var myDateNullable : Date? = null
        println(myDateNullable.customFormat())
    }
    private fun lambdas(){
        val myIntList = arrayListOf<Int>(0,1,2,3,4,4,5,6,7,8,9)
        myIntList.filter { number ->
            println(number)
            if (number == 1){
                return@filter true
            }
            number > 5 }
        //or
        val filteredList = myIntList.filter { it > 4 }

        val mySumFun = fun (x: Int ,y:Int) : Int{
            return x + y
        }
        println(myOperateFun(2,4, mySumFun))
        myOperateFun(5,10){x , y ->
            x - y
        }
        myAsyncFun("John"){
            println(it)
        }
    }
    private fun myOperateFun(x: Int,y: Int ,myFun: (Int,Int) -> Int) :Int{
        return myFun(x,y)
    }
    private fun myAsyncFun(name : String , hello: (String) -> Unit){
        val myNewString = "Hello $name"
        thread {
            Thread.sleep(5000)
            hello(myNewString)
        }
    }
}