package sample

fun hello(): String = "Hello, Kotlin/Native!"

fun main() {
    println(hello())

    // 1) Simple State
    // Just your usual mutable state, in the main thread.
//    runSimpleState()


    // 2) Frozen State
//    freezeSomeState()
//    failChanges()
}