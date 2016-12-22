package com.github.wjc133.clz

/**
  * Created by wjc133
  * Date: 2016/12/21
  * Time: 9:33
  */
object Main2 {
  def main(args: Array[String]): Unit = {
    val person = new Person
    println(person.age)
    person.age = 2
    println(person.age)
    person.age = 999
    println(person.age)
  }
}
