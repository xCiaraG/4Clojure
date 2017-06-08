(fn [l] 
  (loop [news '() tmpnew (conj '() (first l)) tmpl (rest l)] 
    (if (empty? tmpl)
      (reverse (conj news tmpnew))
      (if (= (last tmpnew) (first tmpl))  
        (recur news (conj tmpnew (first tmpl)) (rest tmpl))   
        (recur (conj news tmpnew) (conj '() (first tmpl)) (rest tmpl))))))
