// Más información acerca de F# en http://fsharp.net
// Vea el proyecto "Tutorial de F#" para obtener más ayuda.
module fibo =
let nums=[0..10]
let rec fib n = if n < 1 then 0 else if n < 2 then 1 else fib (n-2) + fib(n-1)
let finres = List.map fib nums
printfn "%A" finres
let _ = System.Console.ReadLine()
