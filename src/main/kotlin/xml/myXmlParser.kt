package xml

import org.jsoup.Jsoup

fun main() {
    val resp = Jsoup
        .connect("https://flo.health/sitemaps/pages-1.xml")
        .get()

    val myArray = resp.getElementsByTag("loc")

    val newArray = arrayListOf<String>()

    myArray.forEach {
        newArray.add(it.text())
    }

    println(newArray.size)
    println(newArray.toSet().size)

    for (link in newArray){
        println(link)
    }

}