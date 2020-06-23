println("Called with args:")
args.forEach {
    println("- $it")
}

// ----------------------------------------------------
// $ kotlinc -script helloScript.kts hello ‘with spaces’
//
// Called with args:
// - hello
// - with spaces
