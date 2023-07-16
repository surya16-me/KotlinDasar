fun main() {
    val a: Byte = 127
    val b: Short = 32767
    val c = 2147
    val d = 9585844856748
    val e = 1.2
    val f = 1.2F

    println("Nilai a adalah $a tipe nya adalah ${a.javaClass.simpleName}")
    println("Nilai b adalah $b tipe nya adalah ${b.javaClass.simpleName}")
    println("Nilai c adalah $c tipe nya adalah ${c.javaClass.simpleName}")
    println("Nilai d adalah $d tipe nya adalah ${d.javaClass.simpleName}")
    println("Nilai e adalah $e tipe nya adalah ${e.javaClass.simpleName}")
    println("Nilai f adalah $f tipe nya adalah ${f.javaClass.simpleName}")
}