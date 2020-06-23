import java.io.File

fun File.printPathAndSubdirs() {
    println(path)
    listFiles { file -> file.isDirectory }?.forEach {
        it.printPathAndSubdirs()
    }
}

File(".").printPathAndSubdirs()

// ----------------------------------------------------
// $ kotlinc -script dirsExploreRecursionExtension.kts
//
// .
// ./dir2
// ./dir2/dir2.1
// ./dir2/dir2.2
// ./dir1
