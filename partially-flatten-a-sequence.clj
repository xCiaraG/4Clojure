(fn [s]
  (loop [tmps s ans '()]
    (if (empty? tmps)
      (reverse ans)
      (if (sequential? (first (first tmps)))
        (recur (conj (conj (rest tmps) (rest (first tmps))) (first (first tmps))) ans)
        (if (< 0 (count (first tmps))) 
        	(recur (rest tmps) (conj ans (first tmps)))
        	(recur (rest tmps) ans))))))