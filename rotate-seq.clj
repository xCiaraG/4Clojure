(fn [n s]
  (if (> n 0)
    (loop [tmpn n tmps s]
      (if (= 0 tmpn)
        tmps
        (recur (dec tmpn) (concat (rest tmps) (list (first tmps))))))
    (loop [tmpn n tmps s]
      (if (= 0 tmpn)
        tmps
        (recur (inc tmpn) (concat (list (last tmps)) (butlast tmps)))))))