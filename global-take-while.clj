(fn [n p s]
  (loop [ans '() c 0 tmps s]
    (if (= c n)
      (reverse ans)
      (if (and (p (first tmps)) (= (inc c) n))
        (recur ans (inc c) (rest tmps))
        (if (p (first tmps))
          (recur (conj ans (first tmps)) (inc c) (rest tmps))
          (recur (conj ans (first tmps)) c (rest tmps)))))))