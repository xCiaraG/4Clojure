(fn [s1 s2]
  (loop [tmps1 s1 news #{}]
    (if (empty? tmps1)
      news
      (recur (rest tmps1) (loop [tmps2 s2 tmpnews news]  
                            (if (empty? tmps2)
                              tmpnews
                              (recur (rest tmps2) (conj tmpnews (concat (vector (first tmps1)) (vector (first tmps2))))))) ))))