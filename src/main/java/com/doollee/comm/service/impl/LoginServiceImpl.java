package com.doollee.comm.service.impl;

import com.doollee.comm.service.LoginService;
import com.doollee.comm.service.impl.LoginMapper;
import com.doollee.comm.service.impl.LoginServiceImpl;
import com.doollee.comm.service.vo.LoginVO;

import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
  @Resource(name = "loginMapper")
  private LoginMapper loginMapper;
  
  public LoginVO login(LoginVO vo) throws Exception {
    return this.loginMapper.login(vo);
  }

  public int deviceInfoIns(Map<String, Object> map) throws Exception {
    return loginMapper.deviceInfoIns( map );
  }
}
