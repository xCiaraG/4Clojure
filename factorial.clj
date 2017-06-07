(fn [x] 
	(loop [tmp (- x 1) tmp2 x] 
		(if (= tmp 0) 
			tmp2 
			(recur (- tmp 1) (* tmp2 tmp)) )))