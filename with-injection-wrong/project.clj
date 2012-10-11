(defproject with-injection-wrong "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [com.cemerick/piggieback "0.0.2"]]

  ;; this is needed to add some nrepl middleware,
  ;; see https://github.com/cemerick/piggieback
  :injections [(require 'cemerick.piggieback)]

  :main with-injection-wrong.core
)
