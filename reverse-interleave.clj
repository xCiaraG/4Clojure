(fn [l n]
  (loop [news '() c 0 tmpl l]
    (if (= n c)
      (reverse news)
      (recur (conj news (take-nth n tmpl)) (inc c) (rest tmpl)))))