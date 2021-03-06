(defproject elephantdb "0.4.0-RC2"
  :description "Distributed database specialized in exporting key/value data from Hadoop"
  :url "https://github.com/nathanmarz/elephantdb"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :mailing-list {:name "ElephantDB user mailing list"
                 :archive "https://groups.google.com/d/forum/elephantdb-user"
                 :post "elephantdb-user@googlegroups.com"}
  :min-lein-version "2.0.0"
  :dependencies [[elephantdb/elephantdb-thrift "0.4.0-RC2"]
                 [elephantdb/elephantdb-core "0.4.0-RC2"]
                 [elephantdb/elephantdb-bdb "0.4.0-RC2"]
                 [elephantdb/elephantdb-leveldb "0.4.0-RC2"]
                 [elephantdb/elephantdb-server "0.4.0-RC2"]
                 [elephantdb/elephantdb-cascading "0.4.0-RC2"]]
  :plugins [[lein-sub "0.2.1"]]
  :sub ["elephantdb-thrift"
        "elephantdb-core"
        "elephantdb-bdb"
        "elephantdb-leveldb"
        "elephantdb-server"
        "elephantdb-cascading"])
