package com.functional.chapter2

/**
  * Created by edvorkin on 6/4/15.
  */
object MyObjectImpoved {
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
 private def formatResult(name:String,x:Int, f:Int=>Int) = {
   val msg="The %s number of %d is %d"
   msg.format(name,x,f(x))
 }

   def main(args: Array[String]) {
     println(formatResult("absolute",-42, abs))
     println(formatResult("factorial",5, factorial))
     println(formatResult("fibonacci",7, fib))
   }
 }
