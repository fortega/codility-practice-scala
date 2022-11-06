package com.github.fortega

trait Perf {
  def perf[A](a: => A): (A, Long) = {
    val start = System.currentTimeMillis
    val result = a
    val elapsed = System.currentTimeMillis - start
    return (result, elapsed)
  }
}