(fn [l n] 
  (if (= n 1)
    l
    (apply interleave (repeat n l))))