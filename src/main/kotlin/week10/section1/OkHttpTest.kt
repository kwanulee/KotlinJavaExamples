package week10.section1

import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException

fun main() {
    // OkHttpClient 인스턴스를 생성합니다.
    val client = OkHttpClient()

    // 요청을 정의합니다.
    val request = Request.Builder()
        .url("http://www.example.com")
        .build()

    // 요청을 실행합니다.
    client.newCall(request).execute().use { response ->
        if (!response.isSuccessful) throw IOException("Unexpected code $response")

        // 응답을 출력합니다.
        println(response.body!!.string())
    }
}