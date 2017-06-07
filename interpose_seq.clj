(fn [v l]
  (loop [news '() tmpl l]
    (if (empty? tmpl)
      (reverse (rest news))
      (recur (conj (conj news (first tmpl)) v) (rest tmpl)))))