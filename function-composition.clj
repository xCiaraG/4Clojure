(fn [& f]
  (fn [& args]
    (loop [tmpf (reverse f) ans args]
      (if (empty? tmpf)
        (first ans)
        (recur (rest tmpf) (list (apply (first tmpf) ans)))))))