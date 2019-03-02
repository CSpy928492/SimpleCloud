package cspy.online.mapper;

import cspy.online.bean.ShareTable;
import cspy.online.bean.ShareTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShareTableMapper {
    long countByExample(ShareTableExample example);

    int deleteByExample(ShareTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShareTable record);

    int insertSelective(ShareTable record);

    List<ShareTable> selectByExample(ShareTableExample example);

    ShareTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShareTable record, @Param("example") ShareTableExample example);

    int updateByExample(@Param("record") ShareTable record, @Param("example") ShareTableExample example);

    int updateByPrimaryKeySelective(ShareTable record);

    int updateByPrimaryKey(ShareTable record);
}