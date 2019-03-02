package cspy.online.mapper;

import cspy.online.bean.DownloadOfflineTable;
import cspy.online.bean.DownloadOfflineTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DownloadOfflineTableMapper {
    long countByExample(DownloadOfflineTableExample example);

    int deleteByExample(DownloadOfflineTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DownloadOfflineTable record);

    int insertSelective(DownloadOfflineTable record);

    List<DownloadOfflineTable> selectByExample(DownloadOfflineTableExample example);

    DownloadOfflineTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DownloadOfflineTable record, @Param("example") DownloadOfflineTableExample example);

    int updateByExample(@Param("record") DownloadOfflineTable record, @Param("example") DownloadOfflineTableExample example);

    int updateByPrimaryKeySelective(DownloadOfflineTable record);

    int updateByPrimaryKey(DownloadOfflineTable record);
}