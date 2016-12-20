package com.github.wjc133.map

/**
  * Created by wjc133
  * Date: 2016/12/20
  * Time: 9:40
  */
object MapS1 {
  def main(args: Array[String]): Unit = {
    //不可变映射
    val scores = Map("Alice" -> 10, "Bob" -> 15, "Cindy" -> 20)
    val newScores = scores + ("Fred" -> 9)
    println(scores)
    println(newScores)

    var scores2 = Map("Alice" -> 10, "Bob" -> 15, "Cindy" -> 20)
    scores2 = scores2 + ("Fred" -> 9)
    println(scores2)

    //迭代映射
    for ((k, v) <- scores) {
      println(k + "对应着" + v)
    }

    val revertScores = for ((k, v) <- scores) yield (v, k)
    println("原映射:" + scores)
    println("反转映射:" + revertScores)

    //可变映射
    println("\n\n可变映射")
    val scoresCanEdit = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3)
    println(scoresCanEdit)

    scoresCanEdit += ("Bob" -> 99, "Cindy" -> 7)
    println(scoresCanEdit)

    scoresCanEdit("Wjc133") = 10
    println(scoresCanEdit)

    scoresCanEdit -= "Alice"
    println(scoresCanEdit)

    //获取映射中的值
    println("\n\n获取映射中的值")
    println(scores.getOrElse("Alice", 999))
    println(scoresCanEdit.getOrElse("Alice", 999))

    val alicesScore1 = if (scores.contains("Alice")) scores("Alice") else 999
    val alicesScore2 = if (scoresCanEdit.contains("Alice")) scoresCanEdit("Alice") else 999
    println(alicesScore1)
    println(alicesScore2)
  }
}
