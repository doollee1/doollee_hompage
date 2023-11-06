package com.doollee.comm.service;

import java.util.Map;

import com.doollee.comm.service.vo.LoginVO;

public interface LoginService {
	
    LoginVO login(LoginVO paramLoginVO) throws Exception;
        
    int deviceInfoIns(Map<String, Object> paramMap) throws Exception;
}
