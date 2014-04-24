(defproject com.palletops/pallet-aws "0.9.0-SNAPSHOT"
  :description "A provider for using Pallet with AWS EC2, based on the AWS SDK."
  :url "http://palletops.com"
  :license {:name "All rights reserved"}
  :scm {:url "git@github.com:pallet/pallet-aws.git"}
  :dependencies [[com.palletops/pallet-aws-ops "0.2.1-SNAPSHOT"
                  :exclusions [commons-logging]]
                 [org.clojure/core.match "0.2.0"
                  :exclusions [org.clojure/clojure]]
                 [prismatic/schema "0.2.1"]])
