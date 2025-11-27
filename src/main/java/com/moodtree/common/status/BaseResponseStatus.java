package com.moodtree.common.status;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
public enum BaseResponseStatus implements ResponseStatus {

/**
* 1000: 요청 성공 (OK)
**/
    SUCCESS(1000, HttpStatus.OK.value(), "요청에 성공하였습니다."),
    FAILURE(1001, HttpStatus.BAD_REQUEST.value(), "요청에 실패하였습니다."),


/**
 * 2000 : 멤버 관련
 **/
    SUCCESS_LOGIN(2000, HttpStatus.OK.value(), "로그인에 성공하였습니다."),
    NOT_FOUND_MEMBER(2001, HttpStatus.NOT_FOUND.value(), "존재하지 않는 멤버입니다."),




/**
 * 3000: 편지 관련
 **/
    SUCCESS_LETTER(3000, HttpStatus.OK.value(), "편지 작성에 성공하였습니다."),
    NOT_FOUND_LETTER(2001, HttpStatus.NOT_FOUND.value(), "존재하지 않는 편지입니다."),






/**
 * 4000: 나무 관련
 **/
    SUCCESS_TREE(4000, HttpStatus.OK.value(), "나무 생성에 성공하였습니다."),
    NOT_FOUND_TREE(4001, HttpStatus.NOT_FOUND.value(), "존재하지 않는 나무입니다.")




    ;

    private final int code;
    private final int httpStatus;
    private final String message;

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public int getHttpStatus() {
        return httpStatus;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
