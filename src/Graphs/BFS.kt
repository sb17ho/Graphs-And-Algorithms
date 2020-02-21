package Graphs

import java.util.*

class BFSGraph(vertices: Int) {
    var visited: Set<Int> = emptySet()
    var matrix: LinkedList<LinkedList<Node>> = LinkedList()
    val size: Int = vertices

    init {
        createGraph()
    }

    fun createGraph() {
        for (i in 0 until size) {
            matrix.add(LinkedList())
        }
        //Vertex 0
        matrix[0].add(Node(0, null)) //At 0,0 first element should be there rather the its adjacent vertex
        matrix[0].add(Node(1, null))
        matrix[0].add(Node(2, null))

        //Vertex 1
        matrix[1].add(Node(1, null))
        matrix[1].add(Node(2, null))
        matrix[1].add(Node(3, null))
        matrix[1].add(Node(4, null))

        //Vertex 2
        matrix[2].add(Node(2, null))
        matrix[2].add(Node(4, null))
//        matrix[2].add(Node(3, null))

        //Vertex 3: Out degree zero
        matrix[3].add(Node(3, null))
        matrix[3].add(Node(4, null))

        //vertex 4
        matrix[4].add(Node(4, null))
    }

    fun BFSGraph() {
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
                    BFSVertex(i)
                }
            }
        }
    }

    fun BFSVertex(vi: Int) {
        val vertexQueue: LinkedList<Int> = LinkedList()
        matrix[vi][0].visited = true

        vertexQueue.add(matrix[vi][0].vertex)

        while (!vertexQueue.isEmpty()) {
            val vertex: Int = vertexQueue.removeFirst()
            println(vertex)
            for (j in 1 until matrix[vertex].size) {
                if (matrix[vertex][j].visited == false && !visited.contains(matrix[vertex][j].vertex)) {
                    matrix[vertex][j].visited = true

                    visited += matrix[vertex][j].vertex // might be wrong

                    vertexQueue.add(matrix[vertex][j].vertex)
                }
            }
        }
    }
}

class BFSWeigtedGraph() {

}