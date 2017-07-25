package com.wiscloud.controller;

import com.wiscloud.dto.ResponseDto;
import com.wiscloud.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Leslie on 2017/4/9.
 */
@Controller
@RequestMapping("userInfo")
public class UserInfoController extends AbstractBaseController {
    @Autowired
    private UserInfoService userInfoService ;

    @RequestMapping(value = "/findUserInfoByUserName",method = RequestMethod.GET)
      public ResponseDto findUserInfoByUserName(String userName){
        return successResponse("查询",userInfoService.findUserInfoByUserName(userName));
    }

    @RequestMapping(value = "/userInfoList",method = RequestMethod.GET)
    @ResponseBody
    public ResponseDto userInfoList(){
        return successResponse("查询",userInfoService.userInfoList());
    }
}
