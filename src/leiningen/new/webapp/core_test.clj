(ns {{ns-name}}.core-test
  (:use midje.sweet
        ring.mock.request
        {{ns-name}}.core))

; feel in your tests below

(fact "example test for a ring/compojure handler"
      (let [resp (app (request :get "/"))]
        (get-in resp [:headers "Content-Type"]) => "text/html; charset=utf-8"
        resp => (contains {:status 200 :body "new app"})))
