package cspy.online.mapper;

import cspy.online.bean.SizeModifiedTable;
import cspy.online.bean.SizeModifiedTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SizeModifiedTableMapper {
    long countByExample(SizeModifiedTableExample example);

    int deleteByExample(SizeModifiedTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SizeModifiedTable record);

    int insertSelective(SizeModifiedTable record);

    List<SizeModifiedTable> selectByExample(SizeModifiedTableExample example);

    SizeModifiedTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SizeModifiedTable record, @Param("example") SizeModifiedTableExample example);

    int updateByExample(@Param("record") SizeModifiedTable record, @Param("example") SizeModifiedTableExample example);

    int updateByPrimaryKeySelective(SizeModifiedTable record);

    int updateByPrimaryKey(SizeModifiedTable record);
}