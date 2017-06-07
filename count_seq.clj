(fn [l] 
	(loop [tmp l c 0] 
		(if (empty? tmp) 
			c 
			(recur (rest tmp)(inc c)))))