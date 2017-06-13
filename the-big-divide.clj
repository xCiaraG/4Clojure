(fn [n a b]
  ( - (+ (reduce + (take-while #(> n %) ((fn tmp1 [tmpa] (cons tmpa (lazy-seq (tmp1 (+ tmpa a))))) a)))
  (reduce + (take-while #(> n %) ((fn tmp2 [tmpb] (cons tmpb (lazy-seq (tmp2 (+ tmpb b))))) b))))
    (reduce + (take-while #(> n %) ((fn tmp3 [tmpab] (cons tmpab (lazy-seq (tmp3 (+ tmpab (* a b)))))) (* b a))))))
;Too slow for big cases