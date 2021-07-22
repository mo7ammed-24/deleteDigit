fun main() {
    print(deleteDigit(152))
}
fun deleteDigit(n: Int): Int {
    var myString=n.toString()
    var min=myString.slice(0..n.toString().length-2).toInt()
    for(i in 0..myString.length-1)
        if((myString.slice(0 until i)+myString.slice(i+1 until myString.length)).toInt()>min)
            min=(myString.slice(0 until i)+myString.slice(i+1 until myString.length)).toInt()
    return min
}
