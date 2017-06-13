(fn [m]
  (loop [tmpm m ans {}]
    (if (empty? tmpm)
      ans
      (recur (rest tmpm) 
      	(loop [tomap1 (first (first tmpm)) tomap2 (second (first tmpm)) a ans]
      		(if (empty? tomap2)
      			a
      			(recur tomap1 (rest tomap2) 
      				(assoc a (conj (conj '() (first (first tomap2))) tomap1) 
      					(second (first tomap2))))))))))