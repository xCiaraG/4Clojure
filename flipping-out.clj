(fn [f]
  (fn [& args]
    (apply f (reverse args))))