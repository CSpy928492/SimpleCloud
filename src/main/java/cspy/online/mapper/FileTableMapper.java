package cspy.online.mapper;

import cspy.online.bean.FileTable;
import cspy.online.bean.FileTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileTableMapper {
    long countByExample(FileTableExample example);

    int deleteByExample(FileTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FileTable record);

    int insertSelective(FileTable record);

    List<FileTable> selectByExample(FileTableExample example);

    FileTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FileTable record, @Param("example") FileTableExample example);

    int updateByExample(@Param("record") FileTable record, @Param("example") FileTableExample example);

    int updateByPrimaryKeySelective(FileTable record);

    int updateByPrimaryKey(FileTable record);
}