(fn [n l]
  (loop [news '() tmpl l]
    (if (empty? tmpl)
      (reverse news)
      (if (= n (count (take n tmpl)))
        (recur (conj news (take n tmpl)) (drop n tmpl))
        (recur news (drop n tmpl))))))