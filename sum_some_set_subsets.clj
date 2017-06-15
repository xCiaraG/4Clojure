(fn [& s]
  (let [p (fn powerset [s] 
            (if (empty? s)
              '(())
              (concat (powerset (rest s))
                                 (map #(conj % (first s)) (powerset (rest s))))))
        ss (fn [s2] (loop [tmp (set (map set (p s2))) ans #{}]
                            (if (empty? tmp)
                              ans
                              (if (empty? (first tmp))
                                (recur (rest tmp) ans)
                                (recur (rest tmp) (set (conj ans (reduce + (first tmp)))))))))]
    (loop [tmp (rest s) a (ss (first s))]
      (if (empty? tmp)
        (if (not= 0 (count a))
          true
          false)
        (recur (rest tmp) (clojure.set/intersection a (ss (first tmp))))))))