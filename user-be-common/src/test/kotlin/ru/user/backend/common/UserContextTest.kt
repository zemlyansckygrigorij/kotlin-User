package ru.user.backend.common

import ru.user.backend.common.models.UserModel
import java.time.LocalDate
import kotlin.test.*

internal class UserContextTest{
    @Test
    fun userContextTest(){
        val user: UserModel = UserModel(
            id = "1",
            fname = "Jhon",
            mname = "Stuart",
            lname = "McKensy",
            dob = LocalDate.of(1999,11,14),
            email = "McKensy@mail.ru",
            phone = "111-111-111"
        )

        var queryUserId: String = "123"

        var userContext: UserContext = UserContext(queryUserId,user)

        assertEquals("123",userContext.queryUserId)
        assertEquals(user,userContext.responseUser )
    }
}