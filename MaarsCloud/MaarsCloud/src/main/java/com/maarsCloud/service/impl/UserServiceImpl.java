package com.maarsCloud.service.impl;

import com.maarsCloud.dao.UserDao;        
import com.maarsCloud.model.User;
import com.maarsCloud.model.UserDto;
import com.maarsCloud.service.UserService;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Transactional
@Service(value = "userService")
public class UserServiceImpl implements UserDetailsService, UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private BCryptPasswordEncoder bcryptEncoder;
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userDao.findByUsername(username);
		if(user == null){
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getAuthority());
	}

	private List<SimpleGrantedAuthority> getAuthority() {
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
	}
	
	public List<User> findAll() {
		List<User> list = new ArrayList<>();
		userDao.findAll().iterator().forEachRemaining(list::add);
		return list;
	}
	/*
	@Override
    public void addUser(UserDto user) {
		userDao.addUser(user);
	}
	 */

	@Override
	public void delete(int id) {
		userDao.deleteById(id);
	}
	
	@Override
	public User findOne(String username) {
		return userDao.findByUsername(username);
	}
	
	@Override
    public List<?> findAllDates(){
    	return userDao.findAllDates();
    }
	
	@Override
	public List<?> findRecent(){
		return userDao.findRecent();
	}
	@Override
	public List<?> findActive(){
		return userDao.findActive();
	}

	@Override
	public User findById(int id) {
		Optional<User> optionalUser = userDao.findById(id);
		return optionalUser.isPresent() ? optionalUser.get() : null;
	}

    @Override
    public UserDto update(UserDto userDto) {
        User user = findById(userDto.getID());
        if(user != null) {
            BeanUtils.copyProperties(userDto, user, "password", "username");
            userDao.save(user);
        }
        return userDto;
    }

    @Override
    public User save(UserDto user) {
	    User newUser = new User();
	    newUser.setID(user.getID());
	    newUser.setFirstName(user.getFirstName());
	    newUser.setLastName(user.getLastName());
	    newUser.setEmailAddress(user.getEmailAddress());
	    newUser.setUsername(user.getEmailAddress());
	    newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		newUser.setJobTitle(user.getJobTitle());
		newUser.setTotalTimeAllActivities(user.getTotalTimeAllActivities());
		newUser.setMostRecentDateAllActivities(user.getMostRecentDateAllActivities());
        return userDao.save(newUser);
    }
}
