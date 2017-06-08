(fn [l1 l2] 
  (loop [news {} tmp1 l1 tmp2 l2]
    (if (or (empty? tmp1) (empty? tmp2))
      news
      (recur (into news {(first tmp1) (first tmp2)}) (rest tmp1) (rest tmp2))))) 