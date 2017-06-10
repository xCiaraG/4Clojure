(fn mapp [f x]
  (if (not-empty x)
  (lazy-seq (cons (f (first x)) (mapp f (rest x))))))