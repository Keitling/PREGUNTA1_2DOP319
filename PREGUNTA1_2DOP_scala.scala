import scala.math.sqrt
import scala.math.pow

object Fibonacci extends App{
  
  
  def fiboRecursive(n: Int): Int = {
    if      (n < 2) n
    else    fiboRecursive(n-1) + fiboRecursive(n-2)
  }
 
  def fiboTailRecursive(n: Int): Int = {
    def recursion(n: Int, a: Int, b: Int): Int = {
      if (n > 0) recursion(n - 1, b, a + b)
      else       a
    }
    recursion(n, 0, 1)
  }


  def fiboIter(n: Int): Int = {
    var a = 0
    var b = 1
    for (i <- 0 to n){
      var buffer = a
      a = b
      b = buffer + b
    }
    a
  }
  
  
  def fiboBinet(n: Int): Int =
    ((pow(1 + sqrt(5), n) - (pow(1-sqrt(5), n))) / (pow(2, n) * sqrt(5))).asInstanceOf[Int]
  

  def fib(n:Int):BigInt = {
    def fibs(n:Int):(BigInt,BigInt) = if (n == 1) (1,0) else {
      val (a,b) = fibs(n/2)
      val p = (2*b+a)*a
      val q = a*a + b*b
      if(n % 2 == 0) (p,q) else (p+q,p)
    }
    fibs(n)._1
  }
  
  
  def fiboLazy: Stream[Int] = 0 #:: 1 #:: fiboLazy.zip(fiboLazy.tail).map{case (a,b) => a + b}

 
}
