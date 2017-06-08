(fn [n] 
  (loop [tmpn n s ""]
    (if (= 0 tmpn)
      s
      (if (> tmpn 999)
        (recur (- tmpn 1000) (str s "M"))
        (if (> tmpn 899)
          (recur (- tmpn 900) (str s "CM"))
          (if (> tmpn 499)
            (recur (- tmpn 500) (str s "D"))
            (if (> tmpn 399) 
              (recur (- tmpn 400) (str s "CD"))
              (if (> tmpn 99)
                (recur (- tmpn 100) (str s "C"))
                (if (> tmpn 89)
                  (recur (- tmpn 90) (str s "XC"))
                  (if (> tmpn 49)
                    (recur (- tmpn 50) (str s "L"))
                    (if (> tmpn 39)
                      (recur (- tmpn 40) (str s "XL"))
                      (if (> tmpn 9)
                        (recur (- tmpn 10) (str s "X"))
                        (if (> tmpn 8)
                          (recur (- tmpn 9) (str s "IX"))
                          (if (> tmpn 4)
                            (recur (- tmpn 5) (str s "V"))
                            (if (> tmpn 3)
                              (recur (- tmpn 4) (str s "IV"))
                              (recur (- tmpn 1) (str s "I")))))))))))))))))