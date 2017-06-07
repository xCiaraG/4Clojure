(fn rmd [l] (loop [ans (seq []) prev nil tmp (seq l)]
          (if (empty? tmp) 
            (reverse ans) 
          (if (not= prev (first tmp)) 
          	(recur (conj ans (first tmp)) (first tmp) (rest tmp))
              (recur ans (first tmp) (rest tmp))) )))