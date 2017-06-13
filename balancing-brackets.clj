(fn [s]
  (loop [sparts (clojure.string/split s #"") brackets '()]
    (if (and (empty? sparts) (empty? brackets))
      true
      (if (empty? sparts)
        false
        (if (contains? #{"}" ")" "]"} (first sparts))
          (if (not (or (and (= (first brackets) "{") (= (first sparts)"}"))
                  (and (= (first brackets) "(") (= (first sparts)")")) 
                  (and (= (first brackets) "[") (= (first sparts)"]"))))
            false
            (recur (rest sparts) (rest brackets)))
          (if (contains? #{"{" "(" "["} (first sparts))
            (recur (rest sparts) (conj brackets (first sparts)))
            (recur (rest sparts) brackets)))))))