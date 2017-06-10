(fn [f l]
  (loop [ans {} tmpl l]
    (if (empty? tmpl)
      ans
      (if (contains? ans (f (first tmpl)))
        (recur (assoc ans (f (first tmpl)) (reverse (conj (reverse (get ans (f (first tmpl)))) (first tmpl) ))) (rest tmpl))
        (recur (assoc ans (f (first tmpl)) (list (first tmpl))) (rest tmpl))))))