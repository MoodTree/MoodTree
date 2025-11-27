package com.moodtree.common.excaption;


import com.moodtree.common.status.BaseResponseStatus;
import lombok.Getter;

@Getter
public class MemberException extends DomainException{

    public MemberException(BaseResponseStatus baseResponseStatus) {
        super(baseResponseStatus);
    }

    public MemberException(BaseResponseStatus baseResponseStatus, String detailMessage) {
        super(baseResponseStatus, detailMessage);
    }
}
