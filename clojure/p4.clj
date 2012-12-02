(def d0 (range 999 99 -1))
(defn ispal [x] (if (= (seq x) (reverse x)) x nil))

(reduce max (map #(Integer/parseInt %) (filter not-empty (for [d1 d0 d2 d0] (ispal (str (* d1 d2)))))))
; 906609
