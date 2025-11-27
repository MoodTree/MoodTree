package com.moodtree.common.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.moodtree.common.status.ResponseStatus;
import lombok.Getter;

import static com.moodtree.common.status.BaseResponseStatus.SUCCESS;

@Getter
@JsonPropertyOrder({"code", "message", "result"})
public class BaseResponse<T> implements ResponseStatus {

    private final int code;

    @JsonIgnore
    private int httpStatus;
    private final String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final T result;

    public BaseResponse(ResponseStatus responsestatus) {
        this.code = responsestatus.getCode();
        this.message = responsestatus.getMessage();
        this.result = null;
    }

    public BaseResponse(T result) {
        this.code = SUCCESS.getCode();
        this.message = SUCCESS.getMessage();
        this.result = result;
    }

    public BaseResponse(ResponseStatus responsestatus, T result) {
        this.code = responsestatus.getCode();
        this.message = responsestatus.getMessage();
        this.result = result;
    }

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
