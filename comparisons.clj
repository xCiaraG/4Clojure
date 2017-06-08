(fn [f x y]
  (if (= (f y x) (f x y))
    :eq
  (if (f x y)
    :lt
    :gt)))