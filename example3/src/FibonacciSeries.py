
def print_fibonacci_series(n):
    n1, n2 = 0, 1
    print(n1, n2, end=' ')
    
    for _ in range(2, n):
        n1, n2 = n2, n1 + n2
        print(n2, end=' ')
    
    print()

if __name__ == "__main__":
    count = 10
    print("Fibonacci Series of", count, "numbers:")
    print_fibonacci_series(count)
