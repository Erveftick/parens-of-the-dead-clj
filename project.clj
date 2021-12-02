(defproject parens-of-the-dead "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://www.parens-of-the-dead.com"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]]
  :main ^:skip-aot parens-of-the-dead.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
