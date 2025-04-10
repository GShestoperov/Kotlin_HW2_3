import data.Post
import service.WallService

fun main() {

    WallService.addPost(Post(
        id = 0,
        ownerId = 1,
        fromId = 1,
        date = 100
    ))
    WallService.addPost(Post(
        id = 0,
        ownerId = 2,
        fromId = 2,
        date = 150
    ))

    WallService.updatePost(Post(
        id = 1,
        ownerId = 10,
        fromId = 10,
        date = 250
    ))

    println(WallService)
}