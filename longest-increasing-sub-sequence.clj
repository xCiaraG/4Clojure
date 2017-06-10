 (fn [l]
  (loop [tmpl (rest l) ans (list (first l)) c 1 fans (list (first l)) fc 1]
    (if (and (empty? tmpl) (< fc 2))
      '()
      (if (and (empty? tmpl) (> c fc))
        (reverse ans)
        (if (empty? tmpl)
          (reverse fans)
          (if (= (first ans) (dec (first tmpl)))
            (recur (rest tmpl) (conj ans (first tmpl)) (inc c) fans fc)
            (if (> fc c)
              (recur (rest tmpl) (list (first tmpl)) 1 fans fc)
              (recur (rest tmpl) (list (first tmpl)) 1 ans c)))))))) 