package com.github.wjc133.clz

/**
  * Created by wjc133
  * Date: 2016/12/21
  * Time: 9:22
  * 简单类和无参方法
  */
class Clz1 {
  private var value=0 //必须赋初值初始化
  var age=21
  def increment(){value+=1}  //默认就是共有的方法
  def current()=value
}
