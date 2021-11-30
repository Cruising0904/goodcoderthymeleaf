package com.goodcoder.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
public class Board {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "빈값 안받아요")
    @Size(min=4, max=30, message = "제목은 4자이상 30자 이하입니다.")
    private String title;
    private String content;  
}
