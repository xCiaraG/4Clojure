(fn [& args]
  (loop [t (first args) tmp (rest args)]
    (if (empty? tmp)
      t
      (recur ((first tmp) t (second tmp)) (rest (rest tmp))))))