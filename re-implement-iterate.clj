(fn reimplement [f x]
  (lazy-seq (cons x (reimplement f (f x)))))