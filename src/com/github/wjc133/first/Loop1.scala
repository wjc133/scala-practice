package com.github.wjc133.first

import scala.util.Random

/**
  * Created by wjc133
  * Date: 2016/12/19
  * Time: 12:45
  */
object Loop1 {
  def main(args: Array[String]): Unit = {
    val nums = Array(7, 8, 4, 1, 3, 5, 2, 6, 9)
    val randomNums = new Array[Int](10)
    val random = new Random()
    for (i <- 0 until nums.length) {
      print(nums(i) + " ")
    }
    println("")
    for (i <- randomNums.indices) {
      randomNums(i) = random.nextInt(randomNums.length)
    }
    for (i <- randomNums.indices) {
      print(randomNums(i) + " ")
    }
  }
}
