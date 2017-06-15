(fn [f v s]
  (if (empty? s)
    s
  (loop [ans (conj '() (first s)) tmps (rest s)]
    (if (empty? tmps)
      (reverse ans)
      (if (f' (first ans) (first tmps))
        (recur (conj (conj ans v) (first tmps))(rest tmps))
        (recur (conj ans (first tmps)) (rest tmps)))))))

;;Fails last test. Integer overflow