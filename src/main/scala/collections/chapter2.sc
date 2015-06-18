// 2.3

def curry[A,B,C] (f:(A,B) => C):A => (B => C) =
  (a:A) => (b:B)=>f(a,b)

//2.4
def uncurry[A,B,C](f:A => B => C): (A, B)=> C =
  (a,b) => f(a)(b)


// 2.5

def compose[A,B,C](f: B => C, g: A => B): A => C =
  (a) => f(g(a))

val f=(x:Double)=>math.Pi /2-x
val cos=f compose math.sin
cos(90)
val cos2=f andThen math.sin

cos2(90)



