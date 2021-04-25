package in.sb.security.login.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import in.sb.security.login.dao.IUserSecurity;
import in.sb.security.login.model.User;

@Service
public class MyUserDetailsService implements UserDetailsService {

	private static final Logger LOG = LoggerFactory.getLogger(MyUserDetailsService.class);
	@Autowired
	private IUserSecurity userSecurity;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userSecurity.getUserByUsername(username);
		LOG.debug("User {}", user);
		if (user == null) {
			throw new UsernameNotFoundException("Username [" + username + "] not found!");
		}

		return new UserPrinciple(user);
	}

}
