(ns corenlp.core
  (:import corenlp.custom))


;;takes about 20s to load...

#_
(def c (corenlp.custom.))

(comment
;;testing
  (.conlluPrint c 1 2 )
;;Hello, World!
;;nil
)
;;#object[corenlp.custom 0x5b58e7a2 "corenlp.custom@5b58e7a2"]

;;I had to put StanfordCoreNLP.properties
;;on the classpath, and include the model jar in deps.


#_
(defn custom-pipeline
  []
  (proxy [edu.stanford.nlp.pipeline.StanfordCoreNLP] []
    (conllPrint
      [ annot output]
      (println "Hello, World!"))))

;;testing proxy.
(comment
  (def cp (custom-pipeline))
  (with-open [w  (clojure.java.io/writer "hello.txt" )]
    (.conllPrint cp (edu.stanford.nlp.pipeline.Annotation.) w))
  ;;Hello, World!
  )
