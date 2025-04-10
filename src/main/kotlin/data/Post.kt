package data

data class Post(
    var id: Long,
    val ownerId: Long,
    val fromId: Long,
    val date: Long,
    val replyOwnerId: Long = -1,
    val replyPostId: Long = -1,
    val comments: Comments = Comments(),
    val likes: Likes = Likes(),
    val isFavorite: Boolean = false,
    val postType: String = "post", // Тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest
    val content: String = ""
) {

    override fun toString(): String {
        return "Post(id=$id, ownerId=$ownerId, fromId=$fromId, date=$date, replyOwnerId=$replyOwnerId, replyPostId=$replyPostId, comments=$comments, likes=$likes, isFavorite=$isFavorite, postType='$postType', content='$content')\n"
    }
}