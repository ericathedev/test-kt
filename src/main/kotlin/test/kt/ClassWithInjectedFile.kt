package test.kt

import javax.inject.Inject

class ClassWithInjectedFile  @Inject constructor(private val classToInject: ClassToInject)  {
    fun methodUnderTest() = classToInject.exampleMethod();
}