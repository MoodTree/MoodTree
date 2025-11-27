package com.moodtree.common.excaption;

import com.moodtree.common.status.BaseResponseStatus;
import lombok.Getter;

@Getter
public class TreeException extends DomainException{

    public TreeException(BaseResponseStatus baseResponseStatus) {
        super(baseResponseStatus);
    }

    public TreeException(BaseResponseStatus baseResponseStatus, String detailMessage) {
        super(baseResponseStatus, detailMessage);
    }
}
