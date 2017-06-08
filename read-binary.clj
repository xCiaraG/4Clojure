(fn [s]
  (loop [t 0 tmps (reverse s) c 0]
    (if (empty? tmps)
      (int t)
      (if (= \1 (first tmps))
        (recur (+ t (Math/pow 2 c)) (rest tmps) (inc c))
        (recur t (rest tmps) (inc c))))))