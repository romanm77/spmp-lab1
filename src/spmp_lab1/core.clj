(ns spmp-lab1.core)

(defn func [n seq]
  (when-not (empty? seq)
    (cons
      (reduce + (take n seq))
      (lazy-seq (func n (drop n seq))))))

(println (func 2 [1 2 3 4 5]))