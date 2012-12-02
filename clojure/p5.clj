(def base10 (range 1 11))
(def base20 (range 1 21))
(defn nomod [x y] (= 0 (mod x y)))
(defn allmod [x base] (every? true? (for [b base] (nomod x b))))
(defn allmod10 [x] (allmod x base10))
(defn allmod20 [x] (allmod x base20))

(filter allmod10 (range 1 5000))
; 2520

(filter allmod20 (range 232792000 232793000))
; 232792560
