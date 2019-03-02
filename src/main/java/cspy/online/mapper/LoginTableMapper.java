package cspy.online.mapper;

import cspy.online.bean.LoginTable;
import cspy.online.bean.LoginTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginTableMapper {
    long countByExample(LoginTableExample example);

    int deleteByExample(LoginTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LoginTable record);

    int insertSelective(LoginTable record);

    List<LoginTable> selectByExample(LoginTableExample example);

    LoginTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LoginTable record, @Param("example") LoginTableExample example);

    int updateByExample(@Param("record") LoginTable record, @Param("example") LoginTableExample example);

    int updateByPrimaryKeySelective(LoginTable record);

    int updateByPrimaryKey(LoginTable record);
}