(fn [s]
  (let [trans (fn [l]
                (loop [tmps s a #{}]
                  (if (empty? tmps)
                    a
                    (if (= (last l) (first (first tmps)))
                      (recur (rest tmps) (conj a (conj (conj [] (first l)) (last (first tmps)))))
                      (recur (rest tmps) a))))) create (fn [s2]
                                                         (loop [tmp s2 a s]
                                                          (if (empty? tmp)
                                                            (set a)
                                                            (recur (rest tmp) (concat a (trans (first tmp)))))))]
                      (loop [a s c (count s)]
                        (if (= c (count (create a)))
                          a
                          (recur (create a) (count (create a)))))))