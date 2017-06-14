(fn [s]
  (if (= (+ 2 (count s)) (count (conj s {2 3 4 5})))
    :map
    (if (= (+ 1 (count s)) (count (conj (conj s nil) nil)))
      :set
      (if (= 2 (first (conj (conj s 1) 2)))
        :list
        :vector))))