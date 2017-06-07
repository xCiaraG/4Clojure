(fn [l numb] (loop [ans '() tmp l]
          (if (empty? tmp) 
            (reverse ans)
            (do
            (recur 
             ((fn [n li a] 
                      (loop [tmp li tmpn n] 
                        (if (= 0 tmpn) 
                          tmp
                          (recur (conj tmp a) (dec tmpn))))) 
                    numb ans (first tmp)) (rest tmp))))))