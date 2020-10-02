package ru.user.backend.common.models

import java.time.LocalDate
import kotlin.test.*

internal class UserModelTest{
    @Test
    fun userTests(){
        val user: UserModel= UserModel(
            id = "1",
            fname = "Jhon",
            mname = "Stuart",
            lname = "McKensy",
            dob = LocalDate.of(1999,11,14),
            email = "McKensy@mail.ru",
            phone = "111-111-111"
        )

        assertEquals("1",user.id)
        assertEquals("Jhon",user.fname )
        assertEquals("Stuart",user.mname )
        assertEquals("McKensy",user.lname )
        assertEquals(LocalDate.of(1999,11,14),user.dob )
        assertEquals("McKensy@mail.ru",user.email )
        assertEquals("111-111-111",user.phone )
    }
}