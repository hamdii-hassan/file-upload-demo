package com.example.demofileupload.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class File {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    private Long size;

    private String url;

    @Lob
    private String content;



}
