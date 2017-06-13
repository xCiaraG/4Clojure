(fn [n]
  (if (= (reduce + (take (int (/ (count (str n)) 2)) (map read-string (map str (apply vector (str n)))))) 
         (reduce + (take (int (/ (count (str n)) 2)) (map read-string (map str (apply vector (reverse (str n))))))))
    true
    false))