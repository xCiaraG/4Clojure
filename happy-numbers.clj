(fn [n]
  (loop [tmpn n seen #{}]
    (if (= 1 tmpn)
      true
      (if (contains? seen tmpn)
        false
        (recur (reduce + (map #(* % %) (map read-string (map str (apply vector (str tmpn)))))) (conj seen tmpn))))))