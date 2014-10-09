(defproject {{ns-name}} "0.0.1-SNAPSHOT"
  :description "Cool new project to do things and stuff"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring/ring "1.3.1"]
                 [ring/ring-json "0.3.1"]
                 [ring/ring-defaults "0.1.2"]
                 [compojure "1.2.0"]
                 [cheshire "5.3.1"]
                 [prone "0.6.0"]
                 ]
  :main {{ns-name}}.core
  :plugins [[lein-ring "0.8.12"]]
  :ring {:handler {{ns-name}}.core/app :auto-reload? true :auto-refresh? true}
  :profiles {:dev {:dependencies [[midje "1.6.3"]
                                  [ring-mock "0.1.5"]
                                  ]}})
  
