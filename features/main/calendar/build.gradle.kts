plugins {
    `android-library`
    `kotlin-android`
}
apply<MainGradlePlugin>()
android {
    namespace = "com.example.calendar"
}

dependencies {
    //** default implementations **\\
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}