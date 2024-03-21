
module Main where

fibonacci :: Int -> [Int]
fibonacci n = take n fibs
  where fibs = 0 : 1 : zipWith (+) fibs (tail fibs)

main :: IO ()
main = do
  let count = 10
  putStrLn $ "Fibonacci Series of " ++ show count ++ " numbers: " ++ show (fibonacci count)
