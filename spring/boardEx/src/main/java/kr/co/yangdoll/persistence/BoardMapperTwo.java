package kr.co.yangdoll.persistence;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.junit.runners.Parameterized.Parameters;
import org.mybatis.spring.annotation.MapperScan;

import kr.co.yangdoll.domain.BoardVO;
import kr.co.yangdoll.domain.SearchVO;

@Mapper
//@MapperScan(basePackages = "kr.co.yangdoll.persistence")
public interface BoardMapperTwo {
	
	BoardVO getMultiConBoard(SearchVO vo);
	BoardVO getMultiConBoardTwo(HashMap hm);
	BoardVO getMultiConBoardThree( @Param("searchNum") int searchNum, @Param("searchTitle") String searchTitle);
	int addBoard(BoardVO vo);
	List<BoardVO> getConditionWhereList( HashMap svo);
	List<BoardVO> getConditionTrimList( SearchVO svo);
}
