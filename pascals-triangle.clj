(fn [n]
  (loop [row '(1) c 1]
    (if (= c n)
      row
      (recur ((fn [newrow]
               (loop [ans '() tmprow newrow]
                 (if (= 1 (count tmprow))
                   ans
                   (recur (conj ans (+ (first tmprow) (second tmprow))) (rest tmprow))))) (conj (reverse (conj row 0)) 0)) (inc c)))))