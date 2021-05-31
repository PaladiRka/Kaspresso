plugins {
    id("convention.android-app")
}

android {
    defaultConfig {
        applicationId = "com.kaspersky.kaspresso.kautomatorsample"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraint)

    androidTestImplementation(libs.uiAutomator)
    androidTestImplementation(libs.androidXRules)
    androidTestImplementation(projects.kaspresso)
    androidTestImplementation(projects.kautomator)
}
