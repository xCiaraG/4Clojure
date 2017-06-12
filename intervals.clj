(fn [s]
  (if (empty? s)
    s
	  (loop [ans '() start (first (sort s)) current (first (sort s)) tmps (rest (sort s))]
	    (if (empty? tmps)
	      (reverse (conj ans (conj (conj '() current) start)))
	      (if (or (= current (first tmps)) (= (inc current) (first tmps)))
	        (recur ans start (first tmps) (rest tmps))
	        (recur (conj ans (conj (conj '() current) start)) (first tmps) (first tmps) (rest tmps)))))))