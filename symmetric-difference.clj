(fn [s1 s2]
  (loop [tmps1 s1 ans #{}]
    (if (empty? tmps1)
      (loop [tmps2 s2 newans ans]
        (if (empty? tmps2)
          newans
          (if (contains? s1 (first tmps2))
            (recur (rest tmps2) newans)
            (recur (rest tmps2) (conj newans (first tmps2))))))
      (if (contains? s2 (first tmps1))
        (recur (rest tmps1) ans)
        (recur (rest tmps1) (conj ans (first tmps1)))))))