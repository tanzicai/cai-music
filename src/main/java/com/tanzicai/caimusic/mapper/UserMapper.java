package com.tanzicai.caimusic.mapper;

import com.tanzicai.caimusic.dto.UserDto;
import com.tanzicai.caimusic.entity.User;
import com.tanzicai.caimusic.vo.UserVo;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;



@Mapper(componentModel = "spring")
@Component
public interface UserMapper {

    UserDto toDto(User user);

    UserVo toVo(User user);

    User toUser(UserDto userDto);
}
