package chap7

import java.io.File

fun main(){
    val file = File("data.txt")

    //bufferedReaders() 확장 함수를 사용하면 인스턴스를 만들 수 있다.
    file.bufferedWriter().use { println(it.write("Hello!")) }
    file.bufferedReader().use { println(it.readLine()) }

    file.writer(charset = Charsets.US_ASCII).use { it.write("Hello!") }

    file.bufferedReader(
        charset = Charsets.US_ASCII,
        bufferSize = 100
    ).use{println(it.readLine())}
}