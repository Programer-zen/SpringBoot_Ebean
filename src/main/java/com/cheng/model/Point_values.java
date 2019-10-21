package com.cheng.model;


import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "a_point_values")
public class Point_values extends Model {

    @Id
    public Long id;
    public Long point_id;
    public String point_name;
    public String value_s;
    public String colour_s;












}
