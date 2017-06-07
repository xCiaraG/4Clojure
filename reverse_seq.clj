(fn [l] 
	(loop [tmp l news '()] 
		(if (empty? tmp) 
			news 
			(recur (rest tmp) (conj news (first tmp))))))