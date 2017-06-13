(fn tree? [t]
  (if (or (= nil t) (and (sequential? t) (= 3 (count t)) (every? tree? (rest t))))
    true 
    false))