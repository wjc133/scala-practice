package com.github.wjc133.array

import scala.collection.mutable.ArrayBuffer

/**
  * Created by wjc133
  * Date: 2016/12/19
  * Time: 20:59
  * 给定一个整数数组，产出一个新数组，包含原数组中所有正值，按顺序排列，之后是0或者负值，按原顺序排列
  */
object Array4 {
  def resort(arr: Array[Int]): Array[Int] = {
    val buffer = ArrayBuffer[Int]()
    for (elem <- arr if elem > 0) {
      buffer += elem
    }
    for (elem <- arr if elem <= 0) {
      buffer += elem
    }
    buffer.toArray
  }

  def main(args: Array[String]): Unit = {
    val a = Array(5, 6, 4, 7, 0, 9, 2, -1, -3, -2)
    val u = resort(a)
    println(u.toBuffer)
  }
}
