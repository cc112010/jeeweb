package cn.jeeweb.bbs.modules.sys.service.impl;

import cn.jeeweb.common.mybatis.mvc.service.impl.CommonServiceImpl;
import cn.jeeweb.bbs.modules.sys.entity.Role;
import cn.jeeweb.bbs.modules.sys.mapper.RoleMapper;
import cn.jeeweb.bbs.modules.sys.service.IRoleService;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("roleService")
public class RoleServiceImpl extends CommonServiceImpl<RoleMapper, Role> implements IRoleService {

	@Override
	public List<Role> findListByUserId(String userid) {
		return baseMapper.findRoleByUserId(userid);
	}

}
