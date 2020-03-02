package test.kt

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("test.kt")
                .mainClass(Application.javaClass)
                .start()
    }
}