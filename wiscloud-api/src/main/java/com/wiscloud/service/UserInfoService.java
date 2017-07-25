package com.wiscloud.service;

import java.util.List;
import java.util.Map;

/**
 * Created by Leslie on 2017/4/9.
 */
public interface UserInfoService {

    public Map<String,Object> findUserInfoByUserName(String userName);

    public Map<String,Object> userInfoList();
}
