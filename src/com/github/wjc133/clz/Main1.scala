package com.github.wjc133.clz

/**
  * Created by wjc133
  * Date: 2016/12/21
  * Time: 9:25
  */
object Main1 {
  def main(args: Array[String]): Unit = {
    val myClz = new Clz1
    myClz.increment()
    println(myClz.current) //调用无参方法可以不写括号
    //一种比较不错的实践是getter不加括号,setter加括号
    println(myClz.age)
    myClz.age = 123
    println(myClz.age)
  }
}
