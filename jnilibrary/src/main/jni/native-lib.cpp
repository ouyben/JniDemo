#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_ouyben_jnilibrary_JniLib_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello, I from C++";
    return env->NewStringUTF(hello.c_str());
}