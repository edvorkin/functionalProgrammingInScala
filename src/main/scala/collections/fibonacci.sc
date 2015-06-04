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
fib(8)


