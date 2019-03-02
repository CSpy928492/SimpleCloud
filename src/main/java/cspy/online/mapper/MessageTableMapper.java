package cspy.online.mapper;

import cspy.online.bean.MessageTable;
import cspy.online.bean.MessageTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageTableMapper {
    long countByExample(MessageTableExample example);

    int deleteByExample(MessageTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MessageTable record);

    int insertSelective(MessageTable record);

    List<MessageTable> selectByExample(MessageTableExample example);

    MessageTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MessageTable record, @Param("example") MessageTableExample example);

    int updateByExample(@Param("record") MessageTable record, @Param("example") MessageTableExample example);

    int updateByPrimaryKeySelective(MessageTable record);

    int updateByPrimaryKey(MessageTable record);
}