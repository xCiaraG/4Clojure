(fn [s]
  (clojure.string/join "" (conj (map clojure.string/capitalize (rest (clojure.string/split s #"-"))) (first (clojure.string/split s #"-")))))