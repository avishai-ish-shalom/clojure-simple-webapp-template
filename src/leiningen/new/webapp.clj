(ns leiningen.new.webapp
  (:use [leiningen.new.templates :only [renderer name-to-path sanitize-ns ->files]]))

(def render (renderer "webapp"))

(defn webapp
  [name]
  (let [data {:name name
              :ns-name (sanitize-ns name)
              :sanitized (name-to-path name)}]
    (->files data
            ["test/{{sanitized}}/core_test.clj" (render "core_test.clj" data)]
            ["project.clj" (render "project.clj" data)]
            ["src/{{sanitized}}/core.clj" (render "core.clj" data)])))
