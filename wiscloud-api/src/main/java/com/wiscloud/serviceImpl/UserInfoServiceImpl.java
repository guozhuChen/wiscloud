package com.wiscloud.serviceImpl;

import com.wiscloud.dao.UserInfoMapper;
import com.wiscloud.model.UserInfo;
import com.wiscloud.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Leslie on 2017/4/9.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper ;

    @Override
    public Map<String,Object> findUserInfoByUserName(String userName){
        HashMap<String, Object> dtoMap = new HashMap<String, Object>();// 返回的结果集
        List<Map> userInfoList = userInfoMapper.findUserInfoByUserName(userName) ;
        dtoMap.put("userInfoList",userInfoList);
        return dtoMap ;
    }

    @Cacheable(value = "common")
    @Override
    public Map<String,Object> userInfoList(){
        HashMap<String, Object> dtoMap = new HashMap<String, Object>();// 返回的结果集
        List<UserInfo> userInfoList = userInfoMapper.userInfoList() ;
        dtoMap.put("userInfoList",userInfoList);
        return dtoMap ;
    }
}
