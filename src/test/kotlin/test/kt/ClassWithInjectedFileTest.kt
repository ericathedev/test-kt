package test.kt

import io.micronaut.test.annotation.MicronautTest
import io.micronaut.test.annotation.MockBean
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class ClassWithInjectedFileTest {

    @Inject
    lateinit var classToInject: ClassToInject

    @Inject
    lateinit var classToInjectWithInterface: ClassToInjectWithInterface

    @Inject
    lateinit var classWithInjectedFile: ClassWithInjectedFile

    @Test
    fun `inject mock classToInject`() {
        every { classToInject.exampleMethod() } returns "mock"

        val response = classWithInjectedFile.methodUnderTest()
        Assertions.assertEquals("mock", response)
    }

    @Test
    fun `inject mock classToInjectWithInterface`() {
        every { classToInjectWithInterface.exampleMethod() } returns "mock"

        val response = classWithInjectedFile.methodUnderTestWithInterface()
        Assertions.assertEquals("mock", response)
    }

    @MockBean(ClassToInject::class)
    fun mockClassToInject(): ClassToInject {
        return mockk()
    }

    @MockBean(ClassToInjectWithInterface::class)
    fun mockClassToInjectWithInterface(): ClassToInjectWithInterface {
        return mockk()
    }
}