(fn osc [n & args]
  (lazy-seq (cons n (osc ((first (flatten args)) n) (reverse (conj (reverse (rest (flatten args))) (first (flatten args))))))))
