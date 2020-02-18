package guru.springframework.converters;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import guru.springframework.domain.UserCommand;
import guru.springframework.entities.User;

@Mapper
public interface UserMapper {
	
	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

	UserCommand userToUserCommand(User user);

	User userCommandToUser(UserCommand userCommand);

}
