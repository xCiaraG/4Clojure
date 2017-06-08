(fn [& args]
  (loop [tmp1 0 tmp2 0 tmpl args]
    (if (empty? tmpl)
      (if (and (= false tmp1) (= true tmp2))
               true
               false)
      (if (= true (first tmpl))
        (recur tmp1 true (rest tmpl))
        (recur false tmp2 (rest tmpl))))))