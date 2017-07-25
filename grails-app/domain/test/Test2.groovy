package test

class Test2  {

    String name
    Date dateCreated
    Date lastUpdated

    String toString() {
       return "${name} - ${lastUpdated}"
    }

    List getAll() {
        return Test2.list()
    }
}
