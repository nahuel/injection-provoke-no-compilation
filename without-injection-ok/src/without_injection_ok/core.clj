(ns without-injection-ok.core
   (:require [cljs.repl :as cljsrepl]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
