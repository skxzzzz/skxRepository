package day01.mapper;

import day01.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
public interface UserMapper {

    public List<User> queryUserList();
}
