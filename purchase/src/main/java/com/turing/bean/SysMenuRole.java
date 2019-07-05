package com.turing.bean;

public class SysMenuRole {
    private Long menuId;

    private Long roleId;
    
    private SysMenus menusObj;
    
    private SysRoles rolesObj;
    
    

    public SysMenus getMenusObj() {
		return menusObj;
	}

	public void setMenusObj(SysMenus menusObj) {
		this.menusObj = menusObj;
	}

	public SysRoles getRolesObj() {
		return rolesObj;
	}

	public void setRolesObj(SysRoles rolesObj) {
		this.rolesObj = rolesObj;
	}

	public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}