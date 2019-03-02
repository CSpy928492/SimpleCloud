package cspy.online.mapper;

import cspy.online.bean.FeedbackTable;
import cspy.online.bean.FeedbackTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeedbackTableMapper {
    long countByExample(FeedbackTableExample example);

    int deleteByExample(FeedbackTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FeedbackTable record);

    int insertSelective(FeedbackTable record);

    List<FeedbackTable> selectByExample(FeedbackTableExample example);

    FeedbackTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FeedbackTable record, @Param("example") FeedbackTableExample example);

    int updateByExample(@Param("record") FeedbackTable record, @Param("example") FeedbackTableExample example);

    int updateByPrimaryKeySelective(FeedbackTable record);

    int updateByPrimaryKey(FeedbackTable record);
}