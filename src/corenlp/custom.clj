(ns corenlp.custom
  (:gen-class
   :extends edu.stanford.nlp.pipeline.StanfordCoreNLP
   :state   state
   :init    init
   :constructors {[] []}
   ))

(defn -init []
  [[] []])

(defn -conlluPrint
  [this annot output]
  (println "Hello, World!"))
