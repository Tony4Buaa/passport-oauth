package org.zhenchao.passport.oauth.utils;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.zhenchao.passport.oauth.model.User;

import javax.servlet.http.HttpSession;

/**
 * Session工具类
 *
 * @author zhenchao.wang 2017-01-02 15:41
 * @version 1.0.0
 */
public class SessionUtils {

    /**
     * 缓存用户信息到session
     *
     * @param session
     * @param user
     * @return
     */
    public static boolean putUser(HttpSession session, User user) {
        if (null == user) {
            return false;
        }
        session.setAttribute("user-" + DigestUtils.md5Hex(String.valueOf(user.getId())), user);
        return true;
    }

    /**
     * 从session中获取用户信息
     *
     * @param session
     * @param key
     * @return
     */
    public static User getUser(HttpSession session, String key) {
        if (StringUtils.isBlank(key)) {
            return null;
        }
        return (User) session.getAttribute("user-" + key);
    }

}
