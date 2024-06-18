package di

import ClassA
import org.koin.core.context.startKoin
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val sharedModule = module {
    singleOf(::ClassA)
}

fun initKoin() {
    startKoin {
        sharedModule
    }
}