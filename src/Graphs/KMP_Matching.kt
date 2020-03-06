package Graphs

class KMP_Matching {

    class Pattern(c: String, size: Int) {
        var ch: String = c
        var index: IntArray = IntArray(size)
    }

    var text: String = "abcdadbcabceabcba"
    var s: String = "abcba"
    var pattern: Pattern = Pattern(s, s.length)

    init {
        recongnizePattern(pattern.ch)
    }

    fun recongnizePattern(s: String) {
        for (i in s.length - 1 downTo 0) {
            
        }
    }
}