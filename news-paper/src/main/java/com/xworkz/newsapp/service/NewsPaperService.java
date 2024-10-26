package com.xworkz.newsapp.service;

import com.xworkz.newsapp.dto.NewsPaperDto;

public interface NewsPaperService {
    boolean saveNewsPaper(NewsPaperDto newsPaperDto);
    NewsPaperDto[] getAllNewsPaper();
    boolean getNewsPaperByDate(String newspaperdate);
    boolean	getNewsPaperByLang(String lang);
    boolean getNewsPaperById(Integer id);
    Integer getNumberOfPagesByLang(String lang);
    String getDateById(Integer id);
    boolean updateNoOfArticlesByDate(Integer noOfArticles,String newspaperdate);
    void deleteNewsPaperById(Integer id);
    String getPaperNameById(Integer id);
    String getPaperNameByLang(String lang);
    String getEditorNameByPaperName(String name);
}
