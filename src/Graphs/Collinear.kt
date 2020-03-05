package Graphs

class Collinear {
    var points: Array<Points> = arrayOf()

    init {
        for (i in 0 until 10) {
            points += Points((0..9).random(), (0..9).random())
        }

        for (i in points.indices) {
            println("${points[i].xcord} ${points[i].ycord}")
        }
    }
}