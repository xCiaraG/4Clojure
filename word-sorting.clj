(fn [s]
  (sort-by clojure.string/lower-case (re-seq #"\w+" s)))