import java.io.File

fun main(){
    val file: String = "file.mp3"
    val mediaFile = MediaFile(FileDownloader(file), FilePlayer(file))
    mediaFile.download()
    mediaFile.play()

}


class MediaFile( private val downloader: Downloader,
                 private val player:Player): Downloader by downloader, Player by player{

//    override fun download() {
//        // delegate the function to the downloader param passed, which implements Downloader interface
//        downloader.download()
//    }
//
//    override fun play() {
//        player.play()
//    }
}

class FileDownloader(private var file: String): Downloader{

    override fun download() {
        println("$file downloaded")
    }
}


class FilePlayer(private var file: String): Player{
    override fun play() {
        println("$file playing")
    }
}

interface Downloader {
    fun download()
}

interface Player {
    fun play()
}