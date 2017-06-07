(fn [k, l] 
	(if (and (contains? l k) (= nil (get l k))) 
		true 
		false) )