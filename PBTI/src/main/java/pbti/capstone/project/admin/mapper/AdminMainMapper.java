package pbti.capstone.project.admin.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMainMapper {
	
	/** 메인 통계 조회 **/
	public List<HashMap<String, Object>> selectStatistics(HashMap<String, Object> param);
	
}