package org.gorany.service;

import java.util.HashMap;
import java.util.List;

import org.gorany.domain.IncomeVO;
import org.gorany.mapper.IncomeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Setter;
import lombok.extern.java.Log;

@Service
@Log
public class IncomeServiceImpl implements IncomeService {
	
	@Setter(onMethod_=@Autowired)
	private IncomeMapper mapper;
	
	@Override
	public List<IncomeVO> getIncome() {
		
		return mapper.getIncome();
	}


}
