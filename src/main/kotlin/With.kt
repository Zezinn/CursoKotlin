fun main() {
    val p = Pessoa(1988, "Bill")
    p.acordar()
    p.dormir()

    with(p) {
      acordar()
        dormir()
        doc
    }
}