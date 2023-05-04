package sysmap.socialmediabackend.services;

import sysmap.socialmediabackend.model.User;

import sysmap.socialmediabackend.model.UserDto;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}