Following [https://www.danielebonaldo.com/kotlin-script/](https://www.danielebonaldo.com/kotlin-script/) as a getting started.

# Running

## IDE

Using IntelliJ there's a native plugin by JetBrains. Just create a running configuration to call the scripts.

## Command Line

Install  Kotlin via SdkMan:

```
curl -s https://get.sdkman.io | bash
sdk install kotlin
```

Run scripts with:

```
kotlinc <script.kts> [program arguments] -script
```
