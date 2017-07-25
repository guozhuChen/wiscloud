package com.wiscloud.dao;

import com.wiscloud.model.SysMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Leslie on 2017/4/22.
 */
@Repository
public interface SysMenuMapper {

    /**
     * 查询所有第一层菜单  parentId=0
     * @return
     */
    public List<SysMenu> parentMenu();

    /**
     * 根据parentId 查询子菜单
     * @param parentId
     * @return
     */
    public List<SysMenu> childrenMenu(Integer parentId);
}
