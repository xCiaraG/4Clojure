(fn [s]
  (loop [current (first (reverse s)) tmps (rest (reverse s))]
    (if (empty? tmps)
      (first current)
      (recur ((fn [s1 s2]
        (loop [tmps1 s1 tmps2 s2 news '()]
          (if (empty? tmps2)
            (reverse news)
            (if (< (first tmps1) (second tmps1))
              (recur (rest tmps1) (rest tmps2) (conj news (+ (first tmps2) (first tmps1))))
              (recur (rest tmps1) (rest tmps2) (conj news (+ (first tmps2) (second tmps1)))))))) 
      current (first tmps)) (rest tmps)))))