package com.ouyben.jnilibrary

/**
 * jni 暴露给主app使用的方法
 */
object JniLibUtil {

    fun getStringFromJNI(): String {
        val jniLib = JniLib()
        return jniLib.stringFromJNI()
    }

}