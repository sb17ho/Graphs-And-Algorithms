package Graphs

fun main(args: Array<String>) {
    println("Depth First Search")
    val graph: DFSGraph = DFSGraph(5)
    graph.DFSGraph()
    graph.printList()

    println()
    println("Breadth First Search")
    val graph2: BFSGraph = BFSGraph(5)
    graph2.BFSGraph()
}

