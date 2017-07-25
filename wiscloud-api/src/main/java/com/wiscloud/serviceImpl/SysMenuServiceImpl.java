package com.wiscloud.serviceImpl;

import com.wiscloud.dao.SysMenuMapper;
import com.wiscloud.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Leslie on 2017/4/9.
 */
@Service
public class SysMenuServiceImpl implements SysMenuService {
    @Autowired
    private SysMenuMapper sysMenuMapper ;


}
