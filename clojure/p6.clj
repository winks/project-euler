(defn squares [y] (reduce + (map (fn [x] (* x x)) (range 1 (inc y)))))
(defn sums [y] (let [x (reduce + (range 1 (inc y)))] (* x x)))

(- (sums 10) (squares 10))
; 2640

(- (sums 100) (squares 100))

; 25164150
