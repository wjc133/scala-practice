package com.github.wjc133.array

/**
  * Created by wjc133
  * Date: 2016/12/19
  * Time: 21:11
  * 如何计算Array[Double]的平均值？
  */
object Array5 {
  def getAverage(arr: Array[Double]): Double = {
    var ave = 0.0d
    for (elem <- arr) ave += elem
    ave / arr.length
  }

  def main(args: Array[String]): Unit = {
    val a = Array(5.0d, 4.0d, 3.0d, 2.0d, 1.0d)
    val average = getAverage(a)
    println("average:" + average)
  }
}
