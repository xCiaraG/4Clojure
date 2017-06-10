(fn [s]
  (loop [tmps (rest (clojure.string/split s #"")) t 0]
    (if (empty? tmps)
      t
      (if (and (= "C" (first tmps)) (= "D" (second tmps)))
        (recur (rest (rest tmps)) (+ t 400))
        (if (and (= "X" (first tmps)) (= "C" (second tmps)))
          (recur (rest (rest tmps)) (+ t 90))
          (if (and (= "X" (first tmps)) (= "L" (second tmps)))
            (recur (rest (rest tmps)) (+ t 40))
            (if (and (= "I" (first tmps)) (= "X" (second tmps)))
              (recur (rest (rest tmps)) (+ t 9))
              (if (and (= "I" (first tmps)) (= "V" (second tmps)))
                (recur (rest (rest tmps)) (+ t 4))
                (if (and (= "C" (first tmps)) (= "M" (second tmps)))
                  (recur (rest (rest tmps)) (+ t 900))
                  (recur (rest tmps) (+ t (get {"I" 1, "V" 5, "X" 10, "L" 50, "C" 100, "D" 500, "M" 1000} (first tmps)))))))))))))