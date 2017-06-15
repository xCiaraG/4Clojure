(fn [s]
  (let [tmps (clojure.string/split s #"-")]
    (clojure.string/join "" (conj (map clojure.string/capitalize (rest tmps)) (first tmps)))))