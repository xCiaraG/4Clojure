(fn [l]
  	(if (empty? l)
  	{}
  	(loop [news {} tmpl (rest l) tmps '() keyw (first l)]
  		(if (empty? tmpl)
  			(assoc news keyw (reverse tmps))
  			(if (keyword? (first tmpl))
  				(recur (assoc news keyw (reverse tmps)) (rest tmpl) '() (first tmpl))
  				(recur news (rest tmpl) (conj tmps (first tmpl)) keyw))))))