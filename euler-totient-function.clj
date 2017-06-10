(fn [n]
  (loop [tmpn 2 c 1]
    (if (< n tmpn)
      c
      (if (loop [gcd 1 d 2]
            (if (< tmpn d)
              (= 1 gcd)
              (if (and (= 0 (mod tmpn d)) (= 0 (mod n d)))
                (recur d (inc d))
                (recur gcd (inc d)))))
        (recur (inc tmpn) (inc c))
        (recur (inc tmpn) c)))))