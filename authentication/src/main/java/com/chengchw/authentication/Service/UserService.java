package com.chengchw.authentication.Service;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.chengchw.authentication.Model.User;
import com.chengchw.authentication.Repository.UserRepository;

@Service
public class UserService {
	
	private final UserRepository userrepo;
	
	public UserService(UserRepository userrepo) {
		
		this.userrepo = userrepo;
	}
	
	public User registerUser(User user) {
		
		String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hashed);
		return this.userrepo.save(user);
	}
	
	public User findByEmail(String email) {
		
		return this.userrepo.findByEmail(email);
	}
	
	public User findUserById(Long id) {
		
		return this.userrepo.findUserById(id);
	}
	
	public boolean authenticateUser(String email, String password) {
		
		User user = this.findByEmail(email);
		
		if (user == null) {
			return false;
		}
		
		else {
			
			if(BCrypt.checkpw(password, user.getPassword())) {
				
				return true;
			}
			else {
				return false;
			}
		}
	}
}
