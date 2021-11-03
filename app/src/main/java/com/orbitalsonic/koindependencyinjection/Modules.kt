package com.orbitalsonic.koindependencyinjection

import org.koin.dsl.module

val appModule = module{

    // Define singleton a FirstClass
    // it Creates single instance
    single { FirstClass() }

    // Define a factory
    // it creates new instance every time
    factory { SecondClass() }

}