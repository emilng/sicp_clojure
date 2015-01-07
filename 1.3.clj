(comment
 Define a procedure that takes three numbers
  as arguments and returns the sum of the
  squares of the two larger numbers.
)

(defn larger-nums [n1 n2 n3]
  (def nums [n1 n2 n3])
  (filter
   (fn [x]
     (not= x
           (apply min nums)))
     nums))

(larger-nums 1 2 3)
;(2 3)

(defn square-nums [& nums]
  (map
    (fn [x]
      (* x x))
   nums))

(square-nums 2 3)
;(4 9)

(defn sum-squares [n1 n2 n3]
  (apply +
         (apply square-nums
                (larger-nums n1 n2 n3))))

(sum-squares 1 2 4)
;20