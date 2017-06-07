(fn [start finish] 
  (loop [ans '() s start]
    (if (= s finish)
      (reverse ans)
      (recur (conj ans s) (inc s)))))