(fn [s]
  (assoc (assoc {} :suit (get {\D :diamond \H :heart \C :club \S :spade} (first (apply vector s)))) 
    :rank (get {"2" 0 "3" 1 "4" 2 "5" 3 "6" 4 "7" 5 "8" 6 "9" 7 "T" 8 "J" 9 "Q" 10 "K" 11 "A" 12} (str (second (apply vector s))))))