package tree


fun main() {
    println("=== Tree Library Demo ===")

    // Тестируем RBTree
    println("\n🔴 Testing RBTree:")
    val rbTree = RBTree<Int, String>()
    rbTree.set(50, "Fifty")
    rbTree.set(30, "Thirty")
    rbTree.set(70, "Seventy")
    rbTree.set(20, "Twenty")
    rbTree.set(40, "Forty")

    println("RBTree size: ${rbTree.size}")
    println("Value for key 30: ${rbTree.getValue(30)}")
    println("Is valid RBTree: ${rbTree.isRBTree()}")

    // Тестируем TreapTree
    println("\n🎲 Testing TreapTree:")
    val treapTree = TreapTree<Int, String>()
    treapTree.set(50, "Fifty")
    treapTree.set(30, "Thirty")
    treapTree.set(70, "Seventy")
    treapTree.set(20, "Twenty")
    treapTree.set(40, "Forty")

    println("TreapTree size: ${treapTree.size}")
    println("Value for key 30: ${treapTree.getValue(30)}")
    println("Contains key 25: ${treapTree.contains(25)}")

    // Показываем структуру деревьев
    println("\n📊 Tree traversal:")
    println("RBTree:")
    rbTree.Traverse()

    println("\nTreapTree:")
    treapTree.Traverse()

    println("\n✅ Demo completed successfully!")
}