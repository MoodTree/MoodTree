package com.moodtree.common.excaption;

import com.moodtree.common.status.BaseResponseStatus;
import lombok.Getter;

@Getter
public class LetterException extends DomainException{

    public LetterException(BaseResponseStatus baseResponseStatus) {
        super(baseResponseStatus);
    }

    public LetterException(BaseResponseStatus baseResponseStatus, String detailMessage) {
        super(baseResponseStatus, detailMessage);
    }
}
