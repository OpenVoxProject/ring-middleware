(defproject org.openvoxproject/ring-middleware "2.0.5-SNAPSHOT"
  :dependencies [[cheshire]]

  :min-lein-version "2.7.1"

  :parent-project {:coords [org.openvoxproject/clj-parent "7.4.1-SNAPSHOT"]
                   :inherit [:managed-dependencies]}
  :license {:name "Apache-2.0"
            :url "https://www.apache.org/licenses/LICENSE-2.0.txt"}
          
  ;; Abort when version ranges or version conflicts are detected in
  ;; dependencies. Also supports :warn to simply emit warnings.
  ;; requires lein 2.2.0+.
  :pedantic? :abort

  :plugins [[lein-parent "0.3.7"]
            [org.openvoxproject/i18n "0.7.1"]]

  :deploy-repositories [["clojars" {:url "https://clojars.org/repo"
                                     :username :env/CLOJARS_USERNAME
                                     :password :env/CLOJARS_PASSWORD
                                     :sign-releases false}]]

  :profiles {:dev {:dependencies [[org.openvoxproject/trapperkeeper-webserver-jetty10]
                                  [org.bouncycastle/bcpkix-jdk18on]
                                  [org.openvoxproject/kitchensink nil :classifier "test" :scope "test"]
                                  [org.openvoxproject/trapperkeeper nil :classifier "test" :scope "test"]
                                  [compojure]]}})
