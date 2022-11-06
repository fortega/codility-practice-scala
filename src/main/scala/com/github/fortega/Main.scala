package com.github.fortega

object Main extends App with Perf {
  val tests = Seq(
    Array(1, 3, 6, 4, 1, 2),
    Array(1, 2, 3),
    Array(-1, -3),
    (-100000 to 100000).toArray
  )

  tests.foreach { test =>
    val (result, elapsed) = perf { Solution.solution(test) }
    println(s"n: ${test.size} -> $result @ ${elapsed}ms")
  }
}
