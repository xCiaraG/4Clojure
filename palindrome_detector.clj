(fn [l] (loop [tmpl l tmpr (reverse l)] 
          (if (not= (first tmpl) (first tmpr)) 
          	false
                    (if (or (empty? tmpl) (empty? tmpr)) 
                    	true
                      (recur (rest tmpl) (rest tmpr))))))