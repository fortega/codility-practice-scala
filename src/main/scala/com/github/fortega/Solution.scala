package com.github.fortega

object Solution {
  def solution(a: Array[Int]): Int = {
    val toCheck = a
      .filter(_ > 0) // only positive
      .distinct // only unique
      .sortBy(i => i)

    toCheck
      .zip(Stream.from(1))
      .flatMap {
        case (a, b) if (a != b) => Some(b)
        case _                  => None
      }
      .headOption match {
      case Some(value)                => value
      case None if (toCheck.nonEmpty) => toCheck.max + 1
      case _                          => 1
    }
  }
}