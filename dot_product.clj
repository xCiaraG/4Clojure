(fn [l1 l2] 
  (loop [tmp1 l1 tmp2 l2 t 0]
    (if (empty? tmp1)
      t
      (recur (rest tmp1) (rest tmp2) (+ t (* (first tmp1) (first tmp2)))))))