(fn [l n]
  (loop [news '() tmpn n tmpl l]
    (if (empty? tmpl)
      (reverse news)
    (if (= 1 tmpn)
      (recur news n (rest tmpl))
      (recur (conj news (first tmpl)) (dec tmpn) (rest tmpl))))))