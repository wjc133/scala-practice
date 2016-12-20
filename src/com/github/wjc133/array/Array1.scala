package com.github.wjc133.array

import scala.util.Random

/**
  * Created by wjc133
  * Date: 2016/12/19
  * Time: 13:19
  * 设置a为一个有n个随机整数的数组，要求随机数介于0(包含)和n(不包含)之间
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
