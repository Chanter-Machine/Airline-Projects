package com.airline.dao;

import com.airline.bean.PlacesOfInterestSuggestion;
import com.airline.bean.PlacesOfInterestSuggestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface placesofinterestsuggestionMapper {
    long countByExample(PlacesOfInterestSuggestionExample example);

    int deleteByExample(PlacesOfInterestSuggestionExample example);

    int deleteByPrimaryKey(Integer placesofinterestsuggestionid);

    int insert(PlacesOfInterestSuggestion record);

    int insertSelective(PlacesOfInterestSuggestion record);

    List<PlacesOfInterestSuggestion> selectByExample(PlacesOfInterestSuggestionExample example);

    PlacesOfInterestSuggestion selectByPrimaryKey(Integer placesofinterestsuggestionid);

    int updateByExampleSelective(@Param("record") PlacesOfInterestSuggestion record, @Param("example") PlacesOfInterestSuggestionExample example);

    int updateByExample(@Param("record") PlacesOfInterestSuggestion record, @Param("example") PlacesOfInterestSuggestionExample example);

    int updateByPrimaryKeySelective(PlacesOfInterestSuggestion record);

    int updateByPrimaryKey(PlacesOfInterestSuggestion record);
}