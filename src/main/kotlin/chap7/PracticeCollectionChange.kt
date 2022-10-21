package chap7
/*7_1_9 변환*/
fun main(){

    //새로운 컬렉션을 만들어내는 변환 함수

    //매핑 변환
    println(setOf("red","green","blue").map { it.length})
    println(listOf(1,2,3,4).map { it*it })
    println(byteArrayOf(10,20,30).map { it.toString(16) })

    val seq = generateSequence(50) {if(it==0) null else it/3}

    println(seq.map { it*3 }.toList())

    //변환 시 인덱스를 고려해야 하는 경우 mapIndexed() 함수 사용
    println(List(6){it*it}.mapIndexed{i,n->i to n})

    arrayOf("1","red","2","green","3").mapNotNull { it.toIntOrNull() }
}