package com.wiscloud.dao;

import com.wiscloud.model.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Leslie on 2017/4/9.
 */
@Repository
public interface UserInfoMapper extends BaseMapper<UserInfo,Integer> {

    public List<Map> findUserInfoByUserName(String userName);


    public List<UserInfo> userInfoList();

}
