(defproject org.openvoxproject/ring-middleware "2.1.1-SNAPSHOT"

  ;; These are to enforce consistent versions across dependencies of dependencies,
  ;; and to avoid having to define versions in multiple places. If a component
  ;; defined under :dependencies ends up causing an error due to :pedantic? :abort,
  ;; because it is a dep of a dep with a different version, move it here.
  :managed-dependencies [[org.clojure/clojure "1.12.4"]
                         [ring/ring-codec "1.3.0"]
                         [commons-codec "1.20.0"]
                         [org.slf4j/slf4j-api "2.0.17"]]

  :dependencies [[cheshire "5.13.0"]
                 [org.openvoxproject/http-client "2.2.1"]]

  :min-lein-version "2.7.1"

  :license {:name "Apache-2.0"
            :url "https://www.apache.org/licenses/LICENSE-2.0.txt"}
          
  ;; Abort when version ranges or version conflicts are detected in
  ;; dependencies. Also supports :warn to simply emit warnings.
  ;; requires lein 2.2.0+.
  :pedantic? :abort

  :plugins [[org.openvoxproject/i18n "1.0.2"]]

  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :username :env/CLOJARS_USERNAME
                                     :password :env/CLOJARS_PASSWORD
                                     :sign-releases false}]]

  :profiles {:dev {:dependencies [[org.openvoxproject/trapperkeeper-webserver-jetty10 "1.1.0"]
                                  [org.bouncycastle/bcpkix-jdk18on "1.83"]
                                  [org.openvoxproject/kitchensink "3.5.3" :classifier "test" :scope "test"]
                                  [org.openvoxproject/trapperkeeper "4.3.0" :classifier "test" :scope "test"]
                                  [compojure "1.7.1"]]}})
