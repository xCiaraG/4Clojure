(fn [& f]
  (fn [& args]
    (loop [tmpf f ans '()]
      (if (empty? tmpf)
        (reverse ans)
        (recur (rest tmpf) (conj ans (apply (first tmpf) args)))))))