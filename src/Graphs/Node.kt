package Graphs

class Node(value: Int, visited: Boolean?, weight: Int) {
    var vertex: Int = value
    var visited: Boolean? = visited
    var weight: Int = weight
}

class Points(x: Int, y: Int) {
    var xcord: Int = x
    var ycord: Int = y
}