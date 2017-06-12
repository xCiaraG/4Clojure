(fn [s]
  (loop [news '() tmps s c 0]
    (if (empty? tmps) 
      (if (= c (count (set news)))
        true
        false)
      (recur (concat (set news) (first tmps)) (rest tmps) (+ c (count (first tmps)))))))