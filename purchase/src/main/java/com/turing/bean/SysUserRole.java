package com.turing.bean;

public class SysUserRole {
    private Long userId;

    private Long roleId;
    
    private SysUsers userObj;
    
    private SysUsers rolesObj;
    
    

    public SysUsers getUserObj() {
		return userObj;
	}

	public void setUserObj(SysUsers userObj) {
		this.userObj = userObj;
	}

	public SysUsers getRolesObj() {
		return rolesObj;
	}

	public void setRolesObj(SysUsers rolesObj) {
		this.rolesObj = rolesObj;
	}

	public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}