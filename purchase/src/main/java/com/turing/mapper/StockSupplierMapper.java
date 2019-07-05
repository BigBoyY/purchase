package com.turing.mapper;

import com.turing.bean.StockSupplier;
import com.turing.bean.StockSupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockSupplierMapper {
    long countByExample(StockSupplierExample example);

    int deleteByExample(StockSupplierExample example);

    int insert(StockSupplier record);

    int insertSelective(StockSupplier record);

    List<StockSupplier> selectByExample(StockSupplierExample example);

    int updateByExampleSelective(@Param("record") StockSupplier record, @Param("example") StockSupplierExample example);

    int updateByExample(@Param("record") StockSupplier record, @Param("example") StockSupplierExample example);
}