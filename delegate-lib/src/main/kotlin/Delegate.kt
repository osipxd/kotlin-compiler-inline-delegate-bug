package com.example.lib

import kotlin.reflect.KProperty

open class Delegate {
    inline operator fun <reified V> getValue(thisRef: Any?, property: KProperty<*>): V = error("Stub")
}
