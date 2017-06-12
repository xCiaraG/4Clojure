fn prime [n] 
  (loop [c 0 i 2 ans '()]
  	(println ans)
    (if (= n (count ans))
      (reverse ans)
      (if ((fn [numb] 
             (loop [pos 2]
               (if (= pos numb)
                 true
              	 (if (= 0 (mod numb pos))
                 	false
                 	(recur (inc pos)))))) i)
        (recur (inc c) (inc i) (conj ans i))
        (recur c (inc i) ans)))))