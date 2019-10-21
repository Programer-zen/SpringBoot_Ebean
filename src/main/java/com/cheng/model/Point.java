package com.cheng.model;


import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "point")
public class Point extends Model {

    @Id
    public Long id;
    public String point_name;
    public String point_value;
    public String point_txt;












}
