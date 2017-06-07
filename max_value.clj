(fn [& args] 
	(loop [m 0 tmp args]
             (if (empty? tmp) 
                m 
                (do 
                	(if (> m (first tmp)) 
                                          (recur m (rest tmp))
                                          (recur (first tmp) (rest tmp)))))))