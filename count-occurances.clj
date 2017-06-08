(fn [l]
  (loop [news {} tmpl l]
    (if (empty? tmpl)
      news
      (if (contains? news (first tmpl))
        (recur (assoc news (first tmpl) (inc (get news (first tmpl)))) (rest tmpl))
        (recur (assoc news (first tmpl) 1) (rest tmpl))))))