(ns {{ns-name}}.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.adapter.jetty :refer [run-jetty]]
            [ring.util.response :refer [resource-response content-type]]
            [ring.middleware.resource :refer [wrap-resource]]
            [ring.middleware.json :refer [wrap-json-body wrap-json-response]]
            [ring.middleware.defaults :refer :all]
            [prone.middleware :as prone]))

(defroutes site-routes
  (GET "/" [] "new app")
  (route/not-found "Not found"))

(def app
  (-> site-routes
      (wrap-defaults site-defaults)
      prone/wrap-exceptions))

(defn -main [& args]
  (run-jetty app {:port 8000}))
