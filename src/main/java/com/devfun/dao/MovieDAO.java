package com.devfun.dao;
import java.util.List;
import com.devfun.vo.MovieVO;
 
public interface MovieDAO {
    public List<MovieVO> selectMovie() throws Exception;
}

// DAO는 테이블과 연결되어 데이터 처리를 담당함