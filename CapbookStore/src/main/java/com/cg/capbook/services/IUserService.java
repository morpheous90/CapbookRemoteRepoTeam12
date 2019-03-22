
package com.cg.capbook.services;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.cg.capbook.exceptions.EmailAlreadyRegisteredException;
import com.cg.capbook.exceptions.InvalidUsernameOrPasswordException;
import com.cg.capbook.exceptions.UserAccountNotFoundException;
import com.cg.capbook.exceptions.invalidOTPException;
import com.cg.capbook.model.UserAccount;
public interface IUserService {
	public UserAccount getUserDetails(String emailId) throws UserAccountNotFoundException;
	public UserAccount loginUser(String emailId, String password) throws InvalidUsernameOrPasswordException, UserAccountNotFoundException;
    public String verifyOtp(int otp) throws invalidOTPException;
	UserAccount acceptUserDetails(String emailId, String password, String firstName, String secondName,
			String dateOfBirth, String gender, String mobileNo) throws EmailAlreadyRegisteredException;
}