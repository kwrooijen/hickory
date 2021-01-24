(defproject kwrooijen/hickory "0.7.1"
  :description "HTML as Data"
  :url "http://github.com/davidsantiago/hickory"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}


  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.jsoup/jsoup "1.9.2"]
                 [viebel/codox-klipse-theme "0.0.1"]
                 [quoin "0.1.2" :exclusions [org.clojure/clojure]]]

  :plugins [[lein-codox "0.10.0"]]
  :doo {:build "test"}

  :source-paths ["src/clj" "src/cljc"]

  :profiles
  {:dev  {:source-paths ["src/clj" "src/cljc"]
          :dependencies [[lein-doo "0.1.7"]]
          :plugins      [[lein-doo "0.1.7" :exclusions [org.clojure/clojure]]]}})
