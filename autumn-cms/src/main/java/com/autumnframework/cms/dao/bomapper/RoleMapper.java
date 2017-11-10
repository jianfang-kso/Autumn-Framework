package com.autumnframework.cms.dao.bomapper;

import com.autumnframework.cms.model.po.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table af_role
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table af_role
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    int insert(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table af_role
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    int insertSelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table af_role
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    Role selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table af_role
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table af_role
     *
     * @mbg.generated Wed Oct 25 15:36:28 CST 2017
     */
    int updateByPrimaryKey(Role record);

    /**
     * 获取角色数量
     * @return
     */
    int getRoleCount();

    /**
     * 获取所有角色
     * @param start
     * @param limit
     * @return
     */
    List<Role> selectAllRole(@Param("start") int start, @Param("limit") int limit);
}