(defn fib [x] (if (< x 3) x (+ (fib (dec (dec x))) (fib (dec x)))))
