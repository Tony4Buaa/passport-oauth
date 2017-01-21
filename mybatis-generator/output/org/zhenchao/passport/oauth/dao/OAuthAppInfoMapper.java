package org.zhenchao.passport.oauth.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zhenchao.passport.oauth.model.OAuthAppInfo;
import org.zhenchao.passport.oauth.model.OAuthAppInfoExample;

public interface OAuthAppInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oauth_app_info
     *
     * @mbg.generated Sat Jan 21 12:05:47 CST 2017
     */
    long countByExample(OAuthAppInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oauth_app_info
     *
     * @mbg.generated Sat Jan 21 12:05:47 CST 2017
     */
    int deleteByExample(OAuthAppInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oauth_app_info
     *
     * @mbg.generated Sat Jan 21 12:05:47 CST 2017
     */
    int deleteByPrimaryKey(Long appId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oauth_app_info
     *
     * @mbg.generated Sat Jan 21 12:05:47 CST 2017
     */
    int insert(OAuthAppInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oauth_app_info
     *
     * @mbg.generated Sat Jan 21 12:05:47 CST 2017
     */
    int insertSelective(OAuthAppInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oauth_app_info
     *
     * @mbg.generated Sat Jan 21 12:05:47 CST 2017
     */
    List<OAuthAppInfo> selectByExample(OAuthAppInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oauth_app_info
     *
     * @mbg.generated Sat Jan 21 12:05:47 CST 2017
     */
    OAuthAppInfo selectByPrimaryKey(Long appId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oauth_app_info
     *
     * @mbg.generated Sat Jan 21 12:05:47 CST 2017
     */
    int updateByExampleSelective(@Param("record") OAuthAppInfo record, @Param("example") OAuthAppInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oauth_app_info
     *
     * @mbg.generated Sat Jan 21 12:05:47 CST 2017
     */
    int updateByExample(@Param("record") OAuthAppInfo record, @Param("example") OAuthAppInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oauth_app_info
     *
     * @mbg.generated Sat Jan 21 12:05:47 CST 2017
     */
    int updateByPrimaryKeySelective(OAuthAppInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_oauth_app_info
     *
     * @mbg.generated Sat Jan 21 12:05:47 CST 2017
     */
    int updateByPrimaryKey(OAuthAppInfo record);
}