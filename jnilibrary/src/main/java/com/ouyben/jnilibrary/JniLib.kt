package com.ouyben.jnilibrary

/**
 *
 */
class JniLib {

    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }

}