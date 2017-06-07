(fn [x l] 
  (loop [news {} tmpl l]
    (if (empty? tmpl)
      news
      (recur (assoc news (first tmpl) x) (rest tmpl)))))