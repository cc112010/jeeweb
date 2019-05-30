package cn.jeeweb.web.modules.sys.entity;

import cn.jeeweb.common.mvc.entity.AbstractEntity;

import java.lang.String;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

@TableName("sys_user_role")
public class UserRole extends AbstractEntity<String> {

	/** 编号 */
	@TableId(value = "id", type = IdType.UUID)
	private String id;
	/** 用户编号 */
	private String userId;
	/** 角色编号 */
	private String roleId;

	/**
	 * 获取 id
	 * 
	 * @return: String 编号
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * 设置 id
	 * 
	 * @param: id
	 *             编号
	 */
	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
}
