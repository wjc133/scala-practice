package com.github.wjc133.array

import scala.collection.mutable.ArrayBuffer

/**
  * Created by wjc133
  * Date: 2016/12/20
  * Time: 9:19
  * 如何组织Array对他们进行反序排序？对于ArrayBuffer你又会怎么做？
  */
object Array6 {
  def revertArray(arr: Array[Int]): Unit = {
    for (i <- 0 until arr.length / 2) yield {
      val temp = arr(i)
      arr(i) = arr(arr.length - 1 - i)
      arr(arr.length - 1 - i) = temp
    }
  }

  def revertBuffer(b: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    b.reverse
  }

  def main(args: Array[String]): Unit = {
    val a = Array(1, 2, 3, 4, 5)
    revertArray(a)
    println(a.toBuffer)

    var b = ArrayBuffer(1, 2, 3, 4, 5)
    b = revertBuffer(b)
    println(b)
  }
}
