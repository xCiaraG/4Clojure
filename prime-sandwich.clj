(fn [n]
  (if (and ((fn [numb] 
             (loop [pos 2]
               (if (= pos numb)
                 true
              	 (if (= 0 (mod numb pos))
                 	false
                 	(recur (inc pos)))))) n) (= n (int (/ (+ (loop [tmpn (inc n)]
                        (if ((fn [numb] 
                          loop [pos 2]
                           (if (= pos numb)
                             true
                          	 (if (= 0 (mod numb pos))
                             	false
                              (recur (inc pos)))))) tmpn)
                        tmpn
                        (recur (inc tmpn)))) 
                  (loop [tmpn (dec n)]
                    (if ( (fn [numb] 
                      (loop [pos 2]
                        (if (= pos numb)
                          true
                        	 (if (= 0 (mod numb pos))
                           	false
                           	(recur (inc pos)))))) tmpn)
                    tmpn
                    (recur (dec tmpn))))) 2))))
  true
  false))

;Timeout on last test case