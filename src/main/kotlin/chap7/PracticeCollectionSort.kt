package chap7

/*순서*/
fun main(){
    //오름차순
    println(intArrayOf(5,8,1,4,2))

    //내림차순
    println(
        intArrayOf(5,8,1,4,2).sortedDescending()
    )

    //알파벳 순서에 따라 오름차순
    println(
        listOf("abc","w","xyz","def","hij").sorted()
    )

    //알파벳 순서에 따라 내림차순
    println(
        listOf("abc","w","xyz","def","hij").sortedDescending()
    )

    val seq = generateSequence(1){if(it<50)-it*3 else null}

    println(seq.sorted().toList())
    println(seq.sortedDescending().toList())

}