plugins {
  `java-library`
}

dependencies {
  api(platform(project(":platform")))

  implementation("com.google.api.grpc:grpc-google-cloud-trace-v2")
}

