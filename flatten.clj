(fn [l]
  (loop [news '() tmpl (seq l)]
    (if (empty? tmpl)
      (reverse news)
      (if (not (sequential? (first tmpl)))
        (recur (conj news (first tmpl)) (rest tmpl))
        (recur news (concat (first tmpl)(rest tmpl)))))))
