package com.bishe.smartcommunity.resident.mapper;

import com.bishe.smartcommunity.resident.domain.Courier;
import com.bishe.smartcommunity.resident.domain.CourierExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface CourierMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courier
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    long countByExample(CourierExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courier
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    int deleteByExample(CourierExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courier
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    int deleteByPrimaryKey(Integer courierId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courier
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    int insert(Courier record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courier
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    int insertSelective(Courier record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courier
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    List<Courier> selectByExample(CourierExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courier
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    Courier selectByPrimaryKey(Integer courierId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courier
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    int updateByExampleSelective(@Param("record") Courier record, @Param("example") CourierExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courier
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    int updateByExample(@Param("record") Courier record, @Param("example") CourierExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courier
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    int updateByPrimaryKeySelective(Courier record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table courier
     *
     * @mbg.generated Mon Mar 08 13:49:10 CST 2021
     */
    int updateByPrimaryKey(Courier record);
}