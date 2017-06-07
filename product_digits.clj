(fn [n m] 
  (map (fn [n] (Character/digit n 10)) (seq (str (* n m)))))