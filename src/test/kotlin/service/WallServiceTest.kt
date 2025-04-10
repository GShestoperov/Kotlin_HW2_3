package service

import data.Post
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class WallServiceTest {

    @Before
    fun clearBeforeTest() {
        WallService.clearWall()
    }

    @Test
   fun addPost() {
    val result = WallService.addPost(
          Post(
           id = 0,
           ownerId = 1,
           fromId = 1,
           date = 100
          )
    )

    assertEquals(result, Post(
     id = 1,
     ownerId = 1,
     fromId = 1,
     date = 100
    )
    )

   }

   @Test
   fun updatePost_test1() {

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

       val result = WallService.updatePost(Post(
           id = 1,
           ownerId = 10,
           fromId = 10,
           date = 250
       ))

       assertTrue(result)
   }

    @Test
    fun updatePost_test2() {

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

        val result = WallService.updatePost(Post(
            id = 3,
            ownerId = 10,
            fromId = 10,
            date = 250
        ))

        assertFalse(result)
    }
}