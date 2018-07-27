(defproject vgeshel/aws-metrics-collector "0.1.3"
  :description "Clojure AWS Cloudwatch metric collector"
  :dependencies [[org.clojure/clojure                   "1.9.0"]
                 [org.clojure/core.async                "0.4.474"]
                 [com.amazonaws/aws-java-sdk-cloudwatch "1.11.280"]]
  :repositories {"clojars" {:url           "https://clojars.org/repo"
                            :sign-releases false}})
