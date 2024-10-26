package com.xworkz.newsapp.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class NewsPaperDto {

    private Integer id;
    private String name;
    private Integer noOfPages;
    private String lang;
    private Double price;
    private String editorName;
    private String date;
    private Integer noOfArticles;
}
