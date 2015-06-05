package com.functional.chapter2

/**
 * Created by edvorkin on 6/4/15.
 */
object MyObject {
  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  def fib(n: Int): Int ={
    @annotation.tailrec
    def go(a:Int, b:Int, current:Int,n:Int):Int = {

      if (n == 0) return 0
      if (n==1) return 1
      if (n==current) return b
      else{
        go(b ,a+b,current+1,n)
      }

    }
    go(0,1,1,n)

  }
  def factorial(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n-1, n*acc)
    go(n, 1)
  }
private def formatAbs(x:Int) = {
  val msg="Thea absolute number of %d is %d"
  msg.format(x,abs(x))
}
private def formatFactorial(n:Int) ={
  val msg="The factorial of %d is %d"
  msg.format(n, factorial(n))
}

  private def formatfib(n:Int) = {
    val msg="The fibonacci number of %d is %d"
    msg.format(n, fib(n))
  }

  def main(args: Array[String]) {
    println(formatAbs(-42))
    println(formatFactorial(7))
    println(formatfib(7))
  }
}
