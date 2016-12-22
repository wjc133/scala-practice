package com.github.wjc133.chapter6obj

/**
  * Created by wjc133
  * Date: 2016/12/22
  * Time: 9:13
  */
object Accounts {
  //对象构造器在对象第一次被使用时调用
  private var lastNumber=0
  def newUniqueNumber()={
    lastNumber+=1
    lastNumber
  }
}
