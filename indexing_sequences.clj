(fn [l]
  (loop [n 0 tmpl l news '()]
    (if (empty? tmpl) 
      (reverse news)
      (recur (inc n) (rest tmpl) (conj news (list (first tmpl) n))))))