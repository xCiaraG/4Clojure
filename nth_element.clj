(fn [l n] 
	(if (= 0 n) 
		(first l) 
		(recur (rest l) (dec n)))