; https://lambdaisland.com/blog/2016-10-01-clojurescript-and-google-apps-script
(ns create-incident.core
  (:require [create-incident.entrypoints]))

(defn ^:export hello-world []
  (.. js/SpreadsheetApp
      getActiveSheet
      (appendRow #js ["hello", "world"])))

(defn ^:export double-me [num]
  (* num 2))
