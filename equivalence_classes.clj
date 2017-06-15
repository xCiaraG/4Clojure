(fn [f s]
  (let [t (fn [f s] (loop [tmps s m {}]
    (if (empty? tmps)
      m
      (if (contains? m (f (first tmps)))
        (recur (rest tmps) (assoc m (f (first tmps)) (conj (get m (f (first tmps))) (first tmps))))
        (recur (rest tmps) (assoc m (f (first tmps)) (conj #{} (first tmps))))))))]
    (loop [ans #{} tmp (t f s)]
      (if (empty? tmp)
        ans
        (recur (conj ans (second (first tmp))) (rest tmp))))))