package ru.user.backend.common

import ru.user.backend.common.models.UserModel

data class UserContext(
    var queryUserId: String = "",
    var responseUser: UserModel = UserModel.NONE
)