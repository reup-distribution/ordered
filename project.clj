(defproject ordered-cljs "1.5.3"
  :url "https://github.com/reup-distribution/ordered"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :description "Pure ClojureScript implementation of https://github.com/amalloy/ordered"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.228" :scope "provided"]]
  :plugins [[lein-cljsbuild "1.1.2"]]
  :cljsbuild {:builds [{:source-paths ["src" "test"]
                        :compiler {:output-to "resources/compiled.js"
                                   :optimizations :whitespace}}]
              :test-commands {"test" ["phantomjs"
                                      "resources/test.js"
                                      "resources/test.html"]}}
  :hooks [leiningen.cljsbuild]
  :clean-targets ^{:protect false} [:target-path "resources/compiled.js"])
