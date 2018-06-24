package com.domain.bookstore.securityservice;

import java.util.Set;

import com.domain.bookstore.entities.User;
import com.domain.bookstore.entities.UserBilling;
import com.domain.bookstore.entities.UserPayment;
import com.domain.bookstore.entities.UserShipping;
import com.domain.bookstore.security.PasswordResetToken;
import com.domain.bookstore.security.UserRole;

public interface UserService {

	PasswordResetToken getPasswordResetToken(final String token);
	
	void createPasswordResetTokenForUser(final User user,final String token);

	User findByUsername(String username);
	
	User findByEmail(String email);

	User createUser(User user, Set<UserRole> userRoles) throws Exception;

	User save(User user);

	void updateUserBilling(UserBilling userBilling, UserPayment userPayment, User user);

	void setDefaultPayment(Long usertPaymentId, User user);

	void updateUserShipping(UserShipping userShipping, User user);

	void setUserDefaultShipping(Long userShippingId, User user);
}
