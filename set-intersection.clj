(fn [s1 s2]
  (loop [news #{} tmp1 s1]
    (if (empty? tmp1)
      news
      (if (contains? s2 (first tmp1))
        (recur (conj news (first tmp1)) (rest tmp1))
        (recur news (rest tmp1))))))