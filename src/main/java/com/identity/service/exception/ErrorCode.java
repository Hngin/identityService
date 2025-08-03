package com.identity.service.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {
    USERNAME_INVALID(1003, "Username must be at least 5 characters"),
    USER_NOT_FOUND(404, "User not found"),
    PASSWORD_INVALID(1003, "Password must be at least 8 characters"),
    INVALID_KEY(1001, "Invalid message key"),
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error"),
    USER_EXISTED(1003, "User existed")
    ;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;
}
