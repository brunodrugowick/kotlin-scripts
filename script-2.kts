import java.io.File

val folders: Array<File>? = File(".").listFiles { file -> file.isDirectory }
folders?.forEach {
    folder -> println("- " + folder.absolutePath)
}

// ----------------------------------------------------
// $ kotlinc -script dirsExplore.kts
//
// ./dir2
// ./dir1
