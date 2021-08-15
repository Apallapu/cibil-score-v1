package com.poc.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the cibil_score database table.
 *
 */
@Entity
@Table(name="cibil_score")
@NamedQuery(name="CibilScoreEntity.findAll", query="SELECT c FROM CibilScoreEntity c")
@Data
public class CibilScoreEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "SEQ_CIBIL_SCORE")
    @SequenceGenerator(name="SEQ_CIBIL_SCORE",sequenceName = "SEQ_CIBIL_SCORE",allocationSize = 1)
    @Column(name="cibil_id")
    private Integer cibilId;

    @Column(name="cibil_score")
    private double cibilScore;

    private String name;

    @Column(name="pancard_no")
    private String panCardNo;


}