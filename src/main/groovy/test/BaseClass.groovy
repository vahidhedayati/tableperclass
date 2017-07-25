package test

class BaseClass {

    String name
    Date dateCreated
    Date lastUpdated

    static mapping = {
        tablePerConcreteClass true
        id generator: 'increment'
        version false
    }
}
