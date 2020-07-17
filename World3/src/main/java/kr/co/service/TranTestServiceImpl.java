package kr.co.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.domain.BoardVO;
import kr.co.persistence.BoardDAO;

@Service
@Transactional
public class TranTestServiceImpl implements TranTestService{
	
	@Autowired
	private BoardDAO bDao;
	
	@Override
	public void insertNupdate(BoardVO vo) {
		// TODO Auto-generated method stub
		bDao.insert(vo);
	
		bDao.update(vo);
		
	}

	

}
