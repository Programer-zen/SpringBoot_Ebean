package com.cheng.model;


import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "a_jobs_cron")
public class Jobs_cron extends Model {

    @Id
    public Integer id;
    public String cron;



}
