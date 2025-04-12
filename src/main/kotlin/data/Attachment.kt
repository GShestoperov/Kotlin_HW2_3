package data

interface Attachment {
    val type: String
}

data class PhotoAttachment(
    override val type: String,
    val id: Long,
    val albumId: Long? = null,
    val ownerId: Long,
    val userId: Long? = null,
    val text: String = "",
    val date: Long,
    val url: String
) : Attachment  {
    override fun toString(): String {
        return "PhotoAttachment(type='$type', id=$id, albumId=$albumId, ownerId=$ownerId, userId=$userId, text='$text', date=$date, url='$url')"
    }
}

data class VideoAttachment(
    override val type: String,
    val id: Long,
    val ownerId: Long,
    val title: String = "",
    val description: String = "",
    val date: Long,
    val url: String
) : Attachment  {
    override fun toString(): String {
        return "VideoAttachment(type='$type', id=$id, ownerId=$ownerId, title='$title', description='$description', date=$date, url='$url')"
    }
}

data class AudioAttachment(
    override val type: String,
    val id: Long,
    val ownerId: Long,
    val artist: String = "",
    val title: String = "",
    val date: Long,
    val url: String
) : Attachment  {
    override fun toString(): String {
        return "AudioAttachment(type='$type', id=$id, ownerId=$ownerId, artist='$artist', title='$title', date=$date, url='$url')"
    }
}

data class DocumentAttachment(
    override val type: String,
    val id: Long,
    val ownerId: Long,
    val title: String = "",
    val docType: Int,
    val date: Long,
    val url: String
) : Attachment  {
    override fun toString(): String {
        return "DocumentAttachment(type='$type', id=$id, ownerId=$ownerId, title='$title', docType=$docType, date=$date, url='$url')"
    }
}

data class LinkAttachment(
    override val type: String,
    val url: String,
    val title: String = "",
    val caption: String = "",
    val description: String = "",
) : Attachment  {
    override fun toString(): String {
        return "LinkAttachment(type='$type', url='$url', title='$title', caption='$caption', description='$description')"
    }
}
