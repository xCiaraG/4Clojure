(fn [l] 
  (loop [news (list (first l)) tmpl (rest l)]
    (if (empty? tmpl)
      (reverse news)
      (if (some (partial = (first tmpl)) news)
        (recur news (rest tmpl))
        (recur (conj news (first tmpl)) (rest tmpl))))))