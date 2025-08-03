package com.identity.service.mapper;

import com.identity.service.dto.request.UserCreationRequest;
import com.identity.service.dto.request.UserUpdateRequest;
import com.identity.service.dto.response.UserResponse;
import com.identity.service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
