package com.pzhu.novel.exception;

import org.springframework.security.core.AuthenticationException;

public class VerificationCodeException extends AuthenticationException {
    private static final long serialVersionUID = -6987852999604352052L;

    public VerificationCodeException() {
        super("图形验证码校验失败");
    }
}
