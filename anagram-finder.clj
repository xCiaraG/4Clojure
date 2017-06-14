(fn [s]
  (loop [tmps s ans {}]
    (if (empty? tmps)
      (loop [a ans newa #{}] 
        (if (empty? a)
          newa
          (if (> (count (second (first a))) 1)
          	(recur (rest a) (conj newa (second (first a))))
          	(recur (rest a) newa))))
      (if (contains? ans (set (first tmps)))
        (recur (rest tmps) (assoc ans (set (first tmps)) (conj (get ans (set (first tmps))) (first tmps))))
        (recur (rest tmps) (assoc ans (set (first tmps)) (conj #{} (first tmps))))))))