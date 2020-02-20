package Graphs

import java.util.*

class Graph(vertices: Int) {
    val matrix: LinkedList<LinkedList<Node>> = LinkedList()
    var size: Int = vertices
    var visited: Set<Int> = emptySet()

    init {
        for (i in 0 until size) {
            matrix.add(LinkedList())
        }
        //Vertex 0
        matrix[0].add(Node(0, null)) //At 0,0 first element should be there rather the its adjacent vertex
        matrix[0].add(Node(1, null))

        //Vertex 1
        matrix[1].add(Node(1, null))
        matrix[1].add(Node(2, null))
        matrix[1].add(Node(3, null))

        //Vertex 2
        matrix[2].add(Node(2, null))
        matrix[2].add(Node(0, null))
        matrix[2].add(Node(3, null))

        //Vertex 3: Out degree zero
        matrix[3].add(Node(3, null))
    }

    fun DFSGraph() {
        for (i in 0 until matrix.size) {
            for (j in 0 until matrix[i].size) {
                if (matrix[i][j].visited == null) {
                    matrix[i][j].visited = false
                }
            }
        }

        for (i in 0 until matrix.size) {
            for (j in 0 until matrix[i].size) {
                if (matrix[i][j].visited == false && !visited.contains(matrix[i][j].vertex)) {
                    DFSVertex(i)
                }
            }
        }
    }

    fun DFSVertex(vi: Int) {
        matrix[vi][0].visited = true
        visited += matrix[vi][0].vertex
        for (j in 0 until matrix[vi].size) {
            if (matrix[vi][j].visited == false && !visited.contains(matrix[vi][j].vertex)) {
                DFSVertex(matrix[vi][j].vertex)
            }
        }
    }

    fun print() {
        for (i in 0 until matrix.size) {
            println("Vertex $i")
            for (j in 0 until matrix[i].size) {
                println(matrix[i][j].vertex)
            }
        }
    }

    fun printList(){
        visited.forEach(){
            print(" $it ")
        }
    }
}

class WeightedGraph(){

}