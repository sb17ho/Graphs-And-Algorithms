package Graphs

import java.util.*

class Graph(vertices: Int) {
    val matrix: LinkedList<LinkedList<Node>> = LinkedList()
    var size: Int = vertices

    init {
        for (i in 0 until size) {
            matrix.add(LinkedList())
        }
        //Vertex 0
        matrix[0].add(Node('A', null))
        matrix[0].add(Node('B', null))
        matrix[0].add(Node('C', null))

        //Vertex 1
        matrix[1].add(Node('B', null))
        matrix[1].add(Node('C', null))
        matrix[1].add(Node('D', null))
        matrix[1].add(Node('A', null))

        //Vertex 2
        matrix[2].add(Node('C', null))
        matrix[2].add(Node('B', null))
        matrix[2].add(Node('A', null))
        matrix[2].add(Node('D', null))

        //Vertex 3
        matrix[3].add(Node('D', null))
        matrix[3].add(Node('B', null))
        matrix[3].add(Node('C', null))
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
                if (matrix[i][j].visited == false) {
                    DFSVertex(i, j)
                }
            }
        }
    }

    fun DFSVertex(vi: Int, vj: Int) {
        matrix[vi][vj].visited = true
        for (j in 0 until matrix[vi].size) {
            if(matrix[vi][j].visited == false){
                DFSVertex()
            }
        }
    }

    fun print() {
        for (i in 0 until matrix.size) {
            println("Vertex $i")
            for (j in 0 until matrix[i].size) {
                println(matrix[i][j].visited)
            }
        }
    }
}
