package in.sb.security.login.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import in.sb.security.login.model.User;

@Mapper
public interface IUserSecurity {
	
	public User getUserByUsername(@Param("username") String username);
}
