(fn [n]
  (loop [ans 0 tmp 1]
    (if (= tmp n)
      (if (= n ans)
        true 
        false)
      (if (= 0 (mod n tmp))
        (recur (+ ans tmp) (inc tmp))
        (recur ans (inc tmp))))))