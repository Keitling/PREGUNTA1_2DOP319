fibonacci :: (Integral a) => a -> a
fibonacci 0 = 0
fibonacci 1 = 1
fibonacci n = fibonacci (n - 1) + fibonacci (n - 2)

fibonacci 4
> 3

take 10 [fibonacci n | n <- [0..]]
> [0,1,1,2,3,5,8,13,21,34]
