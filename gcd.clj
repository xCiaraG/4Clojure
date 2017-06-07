(fn [n m]
    (loop [gcd 1 i 1]
      (if (or (> i n) (> i m))
        gcd
        (if (and (= 0 (mod n i)) (= 0 (mod m i)))
          (recur i (inc i))
          (recur gcd (inc i))))))