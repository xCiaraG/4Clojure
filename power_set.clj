(fn [s]
  (let [p (fn powerset [s] 
            (if (empty? s)
              '(())
              (concat (powerset (rest s))
                                 (map #(conj % (first s)) (powerset (rest s))))))]
    (set (map set (p s)))))