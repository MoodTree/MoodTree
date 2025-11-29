package com.moodtree.common.exceptionHandler;


import com.moodtree.common.excaption.DomainException;
import com.moodtree.common.response.BaseErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(DomainException.class)
    public ResponseEntity<BaseErrorResponse> handle(DomainException ex) {
        return ResponseEntity
                .status(ex.getBaseResponseStatus().getHttpStatus())
                .body(new BaseErrorResponse(ex.getBaseResponseStatus(), ex.getMessage()));
    }
}
