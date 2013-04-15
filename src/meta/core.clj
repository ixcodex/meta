(ns meta.core)

(def athing {:is [:thing :record] 
             :name "Jimmy"
             :created-at
             :created-by
             :last-updated-at
             :last-updated-by})

(def thingWithMeta (with-meta athing {:is [:type]
                                      :presentation {:created-at [:timestamp]
                                                     :created-by [:validator 'some-validator]}
                                      :persistence {}}))

(meta thingWithMeta)





