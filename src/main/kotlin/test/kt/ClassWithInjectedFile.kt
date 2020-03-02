package test.kt

import javax.inject.Inject

class ClassWithInjectedFile  @Inject constructor(private val classToInject: ClassToInject,
                                                 private val classToInjectWithInterface : ClassToInjectWithInterface)  {
    fun methodUnderTest() = classToInject.exampleMethod();
    fun methodUnderTestWithInterface() = classToInjectWithInterface.exampleMethod();

}