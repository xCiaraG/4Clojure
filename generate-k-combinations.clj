(fn [n s]
  (let [p (fn powerset [s] 
            (if (empty? s)
              '(())
              (concat (powerset (rest s))
                                 (map #(conj % (first s)) (powerset (rest s))))))]
    (filter #(= n (count %)) (set (map set(p s))))))