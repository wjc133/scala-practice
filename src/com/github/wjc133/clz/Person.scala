package com.github.wjc133.clz

/**
  * Created by wjc133
  * Date: 2016/12/21
  * Time: 9:31
  * getter & setter
  */
class Person {
  private var privateAge=21

  def age = privateAge
  def age_=(newValue:Int): Unit = {
    if (newValue > privateAge) privateAge = newValue
  }
}
