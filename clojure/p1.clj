(defn fx [x] (if (= 0 (mod x 5)) x (if (= 0 (mod x 3)) x 0)))
(defn f35 [x y] (+ x (fx y)))

(reduce f35 (take-while (partial > 1000) (iterate inc 0)))
; 233168
