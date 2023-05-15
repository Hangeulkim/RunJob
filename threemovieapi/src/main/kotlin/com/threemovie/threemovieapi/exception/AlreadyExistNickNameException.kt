package com.threemovie.threemovieapi.exception

import org.springframework.http.HttpStatus

class AlreadyExistNickNameException : CommonException(
	code = "ALREADY_EXIST_Nick_Name",
	message = "이미 존재하는 별명입니다.",
	status = HttpStatus.BAD_REQUEST
)
