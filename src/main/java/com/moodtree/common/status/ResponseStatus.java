package com.moodtree.common.status;

public interface ResponseStatus {

    int getCode();

    int getHttpStatus();

    String getMessage();
}
