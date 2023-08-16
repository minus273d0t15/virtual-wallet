package com.company.web.wallet.helpers;

import com.company.web.wallet.models.User;
import com.company.web.wallet.models.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDto toDto(User user) {
        if (user == null) {
            return null;
        }
        UserDto userDto = new UserDto();
        userDto.setUsername(user.getUsername());
        userDto.setEmail(user.getEmail());
        userDto.setFirstName(user.getFirstName()); // Set the first name
        userDto.setLastName(user.getLastName()); // Set the last name
        userDto.setPassword(user.getPassword());
        return userDto;
    }

    public User fromDto(UserDto userDto) {
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setEmail(userDto.getEmail());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setPassword(userDto.getPassword());
        return user;
    }

}