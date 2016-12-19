package com.github.wjc133.array

import scala.util.Random

/**
  * Created by wjc133
  * Date: 2016/12/19
  * Time: 13:19
  */
object Array1 {
  def main(args: Array[String]): Unit = {
    val randomNums = new Array[Int](10)
    val random = new Random()
    println("")
    for (i <- randomNums.indices) {
      randomNums(i) = random.nextInt(randomNums.length)
    }
    for (i <- randomNums.indices) {
      print(randomNums(i) + " ")
    }
  }
}
