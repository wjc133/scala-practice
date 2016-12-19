package com.github.wjc133.array

/**
  * Created by wjc133
  * Date: 2016/12/19
  * Time: 13:20
  * 相邻位置置换
  */
object Array2 {
  def revertLeft(arr: Array[Int]): Unit = {
    for (i <- 0 until(arr.length, 2)) {
      if (i != arr.length-1) {
        val temp = arr(i)
        arr(i) = arr(i + 1)
        arr(i + 1) = temp
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val a=Array(3,4,5,1,6)
    revertLeft(a)
    println(a.toBuffer)
  }
}
