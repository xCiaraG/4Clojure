(fn [l] (loop [ans '() tmp l]
          (if (empty? tmp) 
            (reverse ans)
            (do
            (recur (conj (conj ans (first tmp)) (first tmp)) (rest tmp))))))