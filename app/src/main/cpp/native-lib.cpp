#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_zzd_test_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello DSPTest";
    return env->NewStringUTF(hello.c_str());
}