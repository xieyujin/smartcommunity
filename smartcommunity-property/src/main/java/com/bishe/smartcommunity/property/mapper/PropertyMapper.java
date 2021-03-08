package com.bishe.smartcommunity.property.mapper;

import com.bishe.smartcommunity.property.domain.Property;
import com.bishe.smartcommunity.property.domain.PropertyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PropertyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table property
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    long countByExample(PropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table property
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    int deleteByExample(PropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table property
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    int deleteByPrimaryKey(Integer propertyId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table property
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    int insert(Property record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table property
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    int insertSelective(Property record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table property
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    List<Property> selectByExample(PropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table property
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    Property selectByPrimaryKey(Integer propertyId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table property
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    int updateByExampleSelective(@Param("record") Property record, @Param("example") PropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table property
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    int updateByExample(@Param("record") Property record, @Param("example") PropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table property
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    int updateByPrimaryKeySelective(Property record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table property
     *
     * @mbg.generated Mon Mar 08 12:53:52 CST 2021
     */
    int updateByPrimaryKey(Property record);
}