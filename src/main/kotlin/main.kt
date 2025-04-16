import data.*
import service.WallService

fun main() {

    WallService.addPost(
        Post(
            id = 0,
            ownerId = 1,
            fromId = 1,
            date = 100,
            attachments = arrayOf(
                PhotoAttachment(
                    Photo(
                        id = 1,
                        ownerId = 1,
                        date = 100,
                        url = "link.ru/photo.jpg"
                    )
                ),
                VideoAttachment(
                    Video(
                        id = 2,
                        ownerId = 1,
                        date = 200,
                        url = "link.ru/video.mp4"
                    )
                )
            )
        )
    )
    WallService.addPost(
        Post(
            id = 0,
            ownerId = 2,
            fromId = 2,
            date = 150
        )
    )

    WallService.updatePost(
        Post(
            id = 2,
            ownerId = 10,
            fromId = 10,
            date = 250
        )
    )

    println(WallService)
}