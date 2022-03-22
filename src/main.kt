import java.util.*

fun main(){
laptops()
towns()
numbers1()
   var tastes= foods(arrayOf("fries", "milkshake","spicy chicken"))
    println(tastes)

}
//function that takes in 4 strings, creates and prints out an array
fun laptops(){
    var models= arrayOf("mac","lenovo","Hp","toshiba")
    println(models.contentToString())

}
//create a function,print out in grammaticatical case
fun towns() {
    var cities = arrayOf("harare", "nairobi", "dodoma", "jakarta")
    cities.sortedArray().forEach { town ->
        println(town.capitalize())
    }
}
//create afunction
fun numbers1(){
    var numb= arrayOf(355,17,4,253,73,90,31,3,73,11,158,62)
    //println(numb[3])
   // println(numb[4])
    //prints out sum of fourth and fifth element
    var wueh= numb[1]+numb[4]
    println(wueh)
//index of 158
    println(numb.indexOf(158))
//sorts in ascending order
    var these=numb.sortedArray()
    println(Arrays.toString(these))
}
//function that takes in three strings and returns a string array of the three elements.
fun foods(a:Array<String>):String{
    var type= a.contentToString()
    return type
}