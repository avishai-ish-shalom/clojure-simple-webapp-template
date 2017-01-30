(defproject {{ns-name}} "0.0.1-SNAPSHOT"
  :description "Cool new project to do things and stuff"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring/ring "1.5.1"]
                 [ring/ring-json "0.4.0"]
                 [ring/ring-defaults "0.2.1"]
                 [compojure "1.5.1"]
                 [cheshire "5.6.2"]
                 [prone "1.1.1"]
                 ]
  :main {{ns-name}}.core
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler {{ns-name}}.core/app :auto-reload? true :auto-refresh? true}
  :profiles {:dev {:dependencies [[midje "1.8.3"]
                                  [ring/ring-mock "0.3.0"]
                                  ]}
             :uberjar {:aot :all}})
  
