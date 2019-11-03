plugins {
  `java-platform`
}

javaPlatform {
  allowDependencies()
}

dependencies {
  api(enforcedPlatform("com.google.cloud:google-cloud-bom:0.117.0-alpha"))
}

