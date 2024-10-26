package org.xworkz.alltxworkzask.newstask.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class NewsDto {
    private int newsId;
    private String newsTitle;
    private String newsAuthor;
    private String newsSource;
    private int newsNoOfPage;
}
