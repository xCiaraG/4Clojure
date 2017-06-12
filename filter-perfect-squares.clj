(fn [s]
  (loop [nums (clojure.string/split s #",") ans '()]
    (if (empty? nums)
      (clojure.string/join "," (reverse ans))
      (if (= 0.0 (mod (Math/sqrt (read-string (first nums))) 1))
        (recur (rest nums) (conj ans (first nums)))
        (recur (rest nums) ans)))))