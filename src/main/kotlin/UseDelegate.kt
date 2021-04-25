package com.example

import com.example.lib.Delegate

// Condition 1. Use subclass from library class which has getValue operator
class DelegateSubclass : Delegate()

class UseDelegate(delegateSubclass: DelegateSubclass) {
    // Condition 2. Declare property using delegate
    val delegatedProperty: String by delegateSubclass
}

// Condition 3. Have kapt enabled and have any dependency with kapt configuration
// See build.gradle.kts
