package cspy.online.mapper;

import cspy.online.bean.UserTable;
import cspy.online.bean.UserTableExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserTableMapper {
    long countByExample(UserTableExample example);

    int deleteByExample(UserTableExample example);

    int insert(UserTable record);

    int insertSelective(UserTable record);

    List<UserTable> selectByExample(UserTableExample example);

    int updateByExampleSelective(@Param("record") UserTable record, @Param("example") UserTableExample example);

    int updateByExample(@Param("record") UserTable record, @Param("example") UserTableExample example);


}