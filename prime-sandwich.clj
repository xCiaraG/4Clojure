(fn [n]
  (let [primes (loop [nums (range 2 2000) ans []]
                 (if (empty? nums)
                   ans
                   (recur (filter #(not= 0 (mod % (first nums))) nums) (conj ans (first nums)))))]
    (if (and (not= 0 (.indexOf primes n)) (some #(= % n) primes) (= n (/ (+ (nth primes (+ 1 (.indexOf primes n))) (nth primes (- (.indexOf primes n) 1))) 2)))
      true
      false)))