package com.bishe.smartcommunity.vehicle.mapper;

import com.bishe.smartcommunity.vehicle.domain.Vehicle;
import com.bishe.smartcommunity.vehicle.domain.VehicleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VehicleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbg.generated Sat Mar 06 18:33:15 CST 2021
     */
    long countByExample(VehicleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbg.generated Sat Mar 06 18:33:15 CST 2021
     */
    int deleteByExample(VehicleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbg.generated Sat Mar 06 18:33:15 CST 2021
     */
    int deleteByPrimaryKey(Integer vehicleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbg.generated Sat Mar 06 18:33:15 CST 2021
     */
    int insert(Vehicle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbg.generated Sat Mar 06 18:33:15 CST 2021
     */
    int insertSelective(Vehicle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbg.generated Sat Mar 06 18:33:15 CST 2021
     */
    List<Vehicle> selectByExample(VehicleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbg.generated Sat Mar 06 18:33:15 CST 2021
     */
    Vehicle selectByPrimaryKey(Integer vehicleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbg.generated Sat Mar 06 18:33:15 CST 2021
     */
    int updateByExampleSelective(@Param("record") Vehicle record, @Param("example") VehicleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbg.generated Sat Mar 06 18:33:15 CST 2021
     */
    int updateByExample(@Param("record") Vehicle record, @Param("example") VehicleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbg.generated Sat Mar 06 18:33:15 CST 2021
     */
    int updateByPrimaryKeySelective(Vehicle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vehicle
     *
     * @mbg.generated Sat Mar 06 18:33:15 CST 2021
     */
    int updateByPrimaryKey(Vehicle record);
}