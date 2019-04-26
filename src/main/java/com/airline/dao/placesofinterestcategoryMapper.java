package com.airline.dao;

import com.airline.bean.PlacesOfInterestCategory;
import com.airline.bean.PlacesOfInterestCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface placesofinterestcategoryMapper {
    long countByExample(PlacesOfInterestCategoryExample example);

    int deleteByExample(PlacesOfInterestCategoryExample example);

    int deleteByPrimaryKey(Integer placesofinterestcategoryid);

    int insert(PlacesOfInterestCategory record);

    int insertSelective(PlacesOfInterestCategory record);

    List<PlacesOfInterestCategory> selectByExample(PlacesOfInterestCategoryExample example);

    PlacesOfInterestCategory selectByPrimaryKey(Integer placesofinterestcategoryid);

    int updateByExampleSelective(@Param("record") PlacesOfInterestCategory record, @Param("example") PlacesOfInterestCategoryExample example);

    int updateByExample(@Param("record") PlacesOfInterestCategory record, @Param("example") PlacesOfInterestCategoryExample example);

    int updateByPrimaryKeySelective(PlacesOfInterestCategory record);

    int updateByPrimaryKey(PlacesOfInterestCategory record);
}