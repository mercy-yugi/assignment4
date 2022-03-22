import java.util.*

fun main(){
laptops()
towns()
numbers1()
   var taste= foods(arrayOf("fries", "milkshake","spicy chicken"))
    println(taste)

}
//function that takes in 4 strings, creates and prints out an array
fun laptops(){
    var models= arrayOf("hp","lenovo","dell","toshiba")
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
    //prints out sum of second and fifth element
    var w= numb[1]+numb[4]
    println(w)
//index of 158
    println(numb.indexOf(158))
//sorts in ascending order
    var t=numb.sortedArray()
    println(Arrays.toString(t))
}
//function that takes in three strings and returns a string array of the three elements.
fun foods(a:Array<String>):String{
    var type= a.contentToString()
    return type
}