package Graphs

fun main(args: Array<String>) {
    println("Depth First Search")
    val graph: DFSGraph = DFSGraph(8)
    graph.DFSGraph()
    graph.printList()

//    println()
//    println("Breadth First Search")
//    val graph2: BFSGraph = BFSGraph(5)
//    graph2.BFSGraph()

//    val collinear: Collinear = Collinear()

//    check()
}

fun test(x: Array<Int>, y: Array<Int>){
    for (i in 0 until x.size) {
        for (j in 0 until y.size){
            if(x[i] == y[j]){
                println("$i $j")
                println("Yes")
            }
        }
    }
}

fun check() {
    val a1: Array<Int> = arrayOf(0, 1, 5, 8, 10)
    val a2: Array<Int> = arrayOf(3, 4, 7, 8, 9, 11)
    test(a1, a2)
    var check: Boolean = false
    var counter: Int = 0

    var i: Int = 0
    var j: Int = 0

    while (!check) {
        if(counter == a1.size){
            break
        }

        if (a1[i] == a2[j]) {
            check = true
        } else if (a1[i] < a2[j]) {
            i++
            counter++
        } else if (a1[i] > a2[j]) {
            j++
            counter++
        }
    }

    if (check == false) {
        println("No such Item")
    } else {
        println("yes it exist")
    }
}
