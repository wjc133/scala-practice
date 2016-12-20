package com.github.wjc133.array

/**
  * Created by wjc133
  * Date: 2016/12/20
  * Time: 9:38
  */
object Array7 {
  def main(args: Array[String]): Unit = {
    val a = Array(1, 2, 2, 3, 3, 4, 5, 5, 5, 5)
    println(a.mkString(","))
    println(a.distinct.mkString(","))
  }
}
