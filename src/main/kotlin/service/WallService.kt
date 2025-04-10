package service

import data.Post

object WallService {
    private var postArr: Array<Post> = arrayOf<Post>()
    private var nextPostId: Long = 1

    fun clearWall() {
        postArr = emptyArray<Post>()
        nextPostId = 1
    }

    fun addPost(post: Post): Post {
        val newPost = post.copy(id = nextPostId)
        nextPostId++

        postArr += newPost

        return postArr.last()
    }

    fun updatePost(post: Post): Boolean {
        var foundIndex: Int = -1

        for ((index, item) in postArr.withIndex()) {
            if (item.id == post.id) {
                foundIndex = index
                break
            }
        }

        if (foundIndex == -1) {
            return false
        }

        postArr[foundIndex] = post.copy()

        return true
    }

    override fun toString(): String {
        var str: String = "Посты на стене: \n"

        for (post in postArr) {
            str += "-----------------------------------------------------\n"
            str += post
        }

        return str
    }


}