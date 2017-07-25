package test


class TestController {

    def test1() {
        Test1 t
        Test1.withTransaction {
            t = new Test1()
            t.name="ahha ${new Date()}"
            t.save()
        }

        if (t) {
            println "yes we have ${t}  "
            //lets pretend this is now another process updating same record
            Test1 t2
            Test1.withTransaction {
                t2 = Test1.get(t.id)
                t2.name="ohho we have a new name ${new Date()}"
                t2.save()
            }

            if (t2) {
                println "yes we have ${t2}  "
            }
        }

        render t.all
    }

    def test2() {
        Test2 t
        Test2.withTransaction {
            t = new Test2()
            t.name="ahha ${new Date()}"
            t.save()
        }

        if (t) {
            println "yes we have ${t}  "
            //lets pretend this is now another process updating same record
            Test2 t2
            Test2.withTransaction {
                t2 = Test2.get(t.id)
                t2.name="ohho we have a new name ${new Date()}"
                t2.save()
            }

            if (t2) {
                println "yes we have ${t2}  "
            }
        }

        render t.all
    }

}
