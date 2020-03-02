package test.kt

interface ClassToInjectInterface { fun exampleMethod() : String }

open class ClassToInjectWithInterface : ClassToInjectInterface {
    override fun exampleMethod() = "exampleMethodReturn"
}