(fn [n x y]
  (- (+ (* (/ (quot (- n 1) x) 2) (+ x (* (quot (- n 1) x) x))) 
        (* (/ (quot (- n 1) y) 2) (+ y (* (quot (- n 1) y) y)))) 
     (* (/ (quot (- n 1) (* y x)) 2) (+ (* y x) (* (quot (- n 1) (* y x)) (* y x))))))