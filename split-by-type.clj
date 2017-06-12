(fn [s]
  (loop [ans #{} tmps (group-by type s)]
    (if (empty? tmps)
      ans
      (recur (conj ans (second (first tmps))) (rest tmps)))))