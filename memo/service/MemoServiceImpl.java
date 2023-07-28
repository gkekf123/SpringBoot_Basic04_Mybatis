package com.simple.basic.memo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.basic.command.MemoVO;

@Service("memoService")
public class MemoServiceImpl implements MemoService{

	// 순서 2
	@Autowired
	private MemoMapper memoMapper;

	@Override
	public void memoWrite(MemoVO vo) {
		memoMapper.memoWrite(vo);
	}

	@Override
	public List<MemoVO> getMemoList() {
		return memoMapper.getMemoList();
	}
	
	
}
