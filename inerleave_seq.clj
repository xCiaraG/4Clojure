(fn [l1 l2]
  (loop [ans '() tmp1 l1 tmp2 l2]
    (if (or (empty? tmp1) (empty? tmp2)) 
      (reverse ans) 
      (recur (conj (conj ans (first tmp1)) (first tmp2)) (rest tmp1) (rest tmp2)))))