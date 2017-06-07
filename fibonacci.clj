(fn [n] (loop [tmpn (- n 2) tmp [1 1]]  
          (if (= 0 tmpn) 
            tmp 
          (recur (dec tmpn)
                 (conj tmp (+ (last tmp) (nth tmp (- (count tmp) 2))))))))