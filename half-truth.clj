(fn [& args]
  (if (and (some #(= true %) args) (some #(= false %) args))
       true
       false))