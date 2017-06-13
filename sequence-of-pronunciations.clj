(fn pron [s]
  (lazy-seq (cons (loop [prev (first s) c 1 tmps (rest s) ans '()]
    (if (empty? tmps)
      (reverse (conj (conj ans c) prev))
      (if (= (first tmps) prev)
        (recur prev (inc c) (rest tmps) ans)
        (recur (first tmps) 1 (rest tmps) (conj (conj ans c) prev))))) 
  (pron (loop [prev (first s) c 1 tmps (rest s) ans '()]
    (if (empty? tmps)
      (reverse (conj (conj ans c) prev))
      (if (= (first tmps) prev)
        (recur prev (inc c) (rest tmps) ans)
        (recur (first tmps) 1 (rest tmps) (conj (conj ans c) prev)))))))))