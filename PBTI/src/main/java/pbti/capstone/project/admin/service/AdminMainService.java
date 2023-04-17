package pbti.capstone.project.admin.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pbti.capstone.project.admin.mapper.AdminMainMapper;


@Service
@Transactional
public class AdminMainService{
	
	@Autowired
	AdminMainMapper mapper;
	

	/** 메인 통계 조회 **/
	public  List<HashMap<String, Object>> selectStatistics(HashMap<String, Object> param) {
		
		return mapper.selectStatistics(param);
		
	}
	
}