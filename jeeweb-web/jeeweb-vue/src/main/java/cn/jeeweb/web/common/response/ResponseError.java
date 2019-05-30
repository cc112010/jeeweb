package cn.jeeweb.web.common.response;

/**
 * All rights Reserved, Designed By www.gzst.gov.cn
 *
 * @version V1.0
 * @package cn.gov.gzst.api.oauth.common.error
 * @title:
 * @description: 错误代码表
 * @author: 王存见
 * @date: 2018/1/8 15:17
 * @copyright: 2017 www.gzst.gov.cn Inc. All rights reserved.
 */
public class ResponseError  extends cn.jeeweb.web.common.bean.ResponseError {
    public static final int USERNAME_OR_PASSWORD_ERROR = 100001; //用户名或密码错误
    public static final int REPEAT_AUTHENTICATION_ERROR = 100002;//请勿重复提交认证,请半小时之后登录
    public static final int INVALID_CLIENT = 100003; //客户端非法
    public static final int INVALID_CLIENT_SECRET = 100004;//客户端密钥非法
    public static final int NOT_FOUND_REDIRECT_URI=100005; //没设置回掉地址
    public static final int INVALID_AUTH_CODE=100006; //授权码错误
    public static final int MSG_LOGIN_FAILE = 100007;//TOKEN失效
    public static final int INVALID_ACCESS_TOKEN=100008; //ACCESS_TOKEN无效
    public static final int INVALID_REFRESH_TOKEN=100009; //REFRESH_TOKEN无效
    public static final int AUTHORIZATION_FAILE=100010; //授权失败

    public static final int TOKEN_IS_NULL = 200001; //TOKEN为空
    public static final int AUTHENTICATION_FAIL = 200002;//认证失败
    public static final int EXPIRED_ACCESS_TOKEN = 200004;//TOKEN过期


}
