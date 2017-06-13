(fn [& nums]
  (loop [tmpn (apply min nums) a (apply min nums)]
    (if (every? #(= 0 (mod tmpn %)) nums)
      tmpn
      (recur (+ a tmpn) a))))