package com.turing.mapper;

import com.turing.bean.QuoteDetail;
import com.turing.bean.QuoteDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuoteDetailMapper {
    long countByExample(QuoteDetailExample example);

    int deleteByExample(QuoteDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(QuoteDetail record);

    int insertSelective(QuoteDetail record);

    List<QuoteDetail> selectByExample(QuoteDetailExample example);

    QuoteDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") QuoteDetail record, @Param("example") QuoteDetailExample example);

    int updateByExample(@Param("record") QuoteDetail record, @Param("example") QuoteDetailExample example);

    int updateByPrimaryKeySelective(QuoteDetail record);

    int updateByPrimaryKey(QuoteDetail record);
}