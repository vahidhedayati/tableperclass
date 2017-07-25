package test

class Test1 extends BaseClass {

    String toString() {
       return "${name} - ${lastUpdated}"
    }

    List getAll() {
        return Test1.list()
    }
}
