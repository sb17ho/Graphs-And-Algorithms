package Graphs

import java.util.*

class DFSGraph(vertices: Int) {
    val matrix: LinkedList<LinkedList<Node>> = LinkedList()
    var size: Int = vertices
    var visited: Set<Int> = emptySet()
    var backedge: Array<Int> = arrayOf()

    init {
        createGraph()
    }

    fun createGraph() {
        for (i in 0 until size) {
            matrix.add(LinkedList())
        }
        //Vertex 0
        matrix[0].add(Node(0, null, 0)) //At 0,0 first element should be there rather the its adjacent vertex
        matrix[0].add(Node(1, null, 0))
        matrix[0].add(Node(2, null, 0))
        matrix[0].add(Node(5, null,0))

        //Vertex 1
        matrix[1].add(Node(1, null,0))
        matrix[1].add(Node(0, null,0))
        matrix[1].add(Node(2, null,0))
        matrix[1].add(Node(3, null,0))
        matrix[1].add(Node(4, null,0))

        //Vertex 2
        matrix[2].add(Node(2, null,0))
        matrix[2].add(Node(0, null,0))
        matrix[2].add(Node(1, null,0))
        matrix[2].add(Node(4, null,0))
//        matrix[2].add(Node(3, null))

        //Vertex 3: Out degree zero
        matrix[3].add(Node(3, null,0))
        matrix[3].add(Node(1, null,0))
        matrix[3].add(Node(4, null,0))

        //vertex 4
        matrix[4].add(Node(4, null,0))
        matrix[4].add(Node(2, null,0))
        matrix[4].add(Node(3, null,0))
        matrix[4].add(Node(1, null,0))

        //Vertex 5
        matrix[5].add(Node(5, null,0))
        matrix[5].add(Node(0, null,0))
        matrix[5].add(Node(6, null,0))
        matrix[5].add(Node(7, null,0))

        //vertex 6
        matrix[6].add(Node(6, null,0))
        matrix[6].add(Node(5, null,0))
        matrix[6].add(Node(7, null,0))

        //Vertex 7
        matrix[7].add(Node(7, null,0))
        matrix[7].add(Node(5, null,0))
        matrix[7].add(Node(6, null,0))
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

    //TODO: Rather than just printing it out save it as an Object (prenum and highest) in an array or list
    fun DFSVertex(vi: Int) {
        matrix[vi][0].visited = true
        visited += matrix[vi][0].vertex
        for (j in 1 until matrix[vi].size) {
            if (matrix[vi][j].visited == false && !visited.contains(matrix[vi][j].vertex)) {
                DFSVertex(matrix[vi][j].vertex)
            }
//            if(visited.contains(matrix[vi][j].vertex)){
//                backedge[]
//            }
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

    fun printList() {
        visited.forEach() {
            print(" $it ")
        }
    }
}

fun articulationPoint() {

}

class DFSWeightedGraph() {

}