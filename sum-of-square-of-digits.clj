(fn [args] 
  (loop [tmpargs args c 0]
    (if (empty? tmpargs)
      c
      (if (< (first tmpargs) (reduce + (map #(Math/pow % 2) (map #(Character/digit % 10) (apply list (str (first tmpargs)))))))
        (recur (rest tmpargs) (inc c))
        (recur (rest tmpargs) c)))))