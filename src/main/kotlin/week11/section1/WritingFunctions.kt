package week11.section1

import java.io.*

fun main() {
    val path = "testfile.txt"
    val outString = "\r\n파일쓰기\t테스트입니다!\n"

    // 1. FileWriter 사용
    //fileWriterTest(path, "FileWriter" + outString)

    // 2. BufferedWriter 사용
    //bufferedWriterTest(path, "BufferedWriter" + outString)

    // 3. PrintWriter 사용
    printWriterTest(path,"PrintWriter" + outString)

    // 4. File의 writeText() 사용
    File(path).writeText(outString)

}

fun fileWriterTest(path: String, outString:String) {
    // Java 스타일
    try {
        val writer = FileWriter(path)
        writer.write(outString)
        writer.close()
    } catch(e:IOException) {}

    // try-catch 문 생략
    val writer = FileWriter(path)
    writer.write(outString)
    writer.close()

    // use 확장함수를 사용한 방식
    FileWriter(path).use { it.write(outString) }
}

fun bufferedWriterTest(path: String, outString:String) {
    val file = File(path)

    // Java 스타일
    try {
        val bw = BufferedWriter(OutputStreamWriter(FileOutputStream(file)))
        bw.write(outString)
        bw.close()
    } catch(e:IOException) {}

    // try-catch 문 생략
    val bw = BufferedWriter(OutputStreamWriter(FileOutputStream(file)))
    bw.write(outString)
    bw.close()

    // use 확장함수를 사용한 방식
    file.bufferedWriter().use { it.write(outString) }
}

fun printWriterTest(path: String, outString:String) {
    val file = File(path)

    // Java 스타일
//    try {
//        val pw = PrintWriter(file)
//        pw.println(outString)
//        pw.close()
//    } catch(e:IOException) {}

    // try-catch 문 생략
//    val pw = PrintWriter(file)
//    pw.println(outString)
//    pw.close()

    // use 확장함수를 사용한 방식
    file.printWriter().use { it.println(outString) }
}

