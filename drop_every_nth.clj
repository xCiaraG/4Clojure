(fn [l n]
  (loop [news '() tmpl l]
    (if (empty? tmpl)
      (flatten news)
      (recur (conj (take (- n 1) tmpl) news)(drop n tmpl)))))