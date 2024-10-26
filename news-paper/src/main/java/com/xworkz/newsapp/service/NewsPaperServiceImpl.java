package com.xworkz.newsapp.service;

import com.xworkz.newsapp.dao.NewsPaperDao;
import com.xworkz.newsapp.dao.NewsPaperDaoImpl;
import com.xworkz.newsapp.dto.NewsPaperDto;
import com.xworkz.newsapp.exception.DateNotFoundException;
import com.xworkz.newsapp.exception.IdNotFoundException;
import com.xworkz.newsapp.exception.LanguageNotFoundException;
import com.xworkz.newsapp.exception.NoOfArticlesNotFoundException;

import javax.naming.NameNotFoundException;
import java.sql.SQLException;

public class NewsPaperServiceImpl implements NewsPaperService{

    @Override
    public boolean saveNewsPaper(NewsPaperDto newsPaperDto) {
        boolean isAdded = false;
        try {
            if (newsPaperDto != null && newsPaperDto.getName() != null) {
                NewsPaperDao newsPaperDao = new NewsPaperDaoImpl();
                newsPaperDao.saveNewsPaper(newsPaperDto);
                isAdded =true;
            }

            if (newsPaperDto.getName() == null) {
                throw new NameNotFoundException("please provide valid Name");
            }
        }catch (NameNotFoundException e) {
            e.printStackTrace();
        }
        return isAdded;
    }

    @Override
    public NewsPaperDto[] getAllNewsPaper() {
        NewsPaperDao newsPaperDao = new NewsPaperDaoImpl();
        return newsPaperDao.getAllNewsPaper();

    }

    @Override
    public boolean getNewsPaperByDate(String newspaperdate) {
        boolean isNewPaperRetrived = false;
        try {
            if (newspaperdate != null) {
                NewsPaperDao newsPaperDao = new NewsPaperDaoImpl();
                newsPaperDao.getNewsPaperByDate(newspaperdate);
                isNewPaperRetrived = true;
            }
            if (newspaperdate == null) {
                throw new DateNotFoundException("please provide valid date");
            }
        }
        catch (DateNotFoundException d)
        {
            d.printStackTrace();
        }
        return isNewPaperRetrived;
    }

    @Override
    public boolean getNewsPaperByLang(String lang) {
        boolean isPaperGiven =false;
        try {
            if (lang != null) {
                NewsPaperDao newsPaperDao = new NewsPaperDaoImpl();
                newsPaperDao.getNewsPaperByLang(lang);
                isPaperGiven = true;
            }
            if (lang == null) {
                throw new LanguageNotFoundException("please provide valid language");
            }
        }
        catch (LanguageNotFoundException l)
        {
            l.printStackTrace();
        }
        return isPaperGiven;
    }

    @Override
    public boolean getNewsPaperById(Integer id) {
        boolean isPaperGiven =false;
        try {
            if (id > 0) {
                NewsPaperDao newsPaperDao = new NewsPaperDaoImpl();
                newsPaperDao.getNewsPaperById(id);
                isPaperGiven = true;
            }
            if (id<=0) {
                throw new IdNotFoundException("please provide valid Id");
            }
        }
        catch (IdNotFoundException i)
        {
            i.printStackTrace();
        }
        return isPaperGiven;
    }

    @Override
    public Integer getNumberOfPagesByLang(String lang) {
        Integer no = 0;
        try {
            if (lang != null) {
                NewsPaperDao newsPaperDao = new NewsPaperDaoImpl();
                no = newsPaperDao.getNumberOfPagesByLang(lang);
            }
            if (lang == null) {
                throw new LanguageNotFoundException("please provide valid language");
            }
        }
        catch (LanguageNotFoundException l)
        {
            l.printStackTrace();
        }
        return no;
    }

    @Override
    public String getDateById(Integer id) {
        String ddate = null;
        try {
            if (id > 0) {
                NewsPaperDao newsPaperDao = new NewsPaperDaoImpl();
                ddate = newsPaperDao.getDateById(id);
            }
            if (id<=0) {
                throw new IdNotFoundException("please provide valid Id");
            }
        }
        catch (IdNotFoundException i)
        {
            i.printStackTrace();
        }
        return ddate;
    }

    @Override
    public boolean updateNoOfArticlesByDate(Integer noOfArticles, String newspaperdate) {
        boolean isUpdated = false;
        try {
            if (newspaperdate != null && noOfArticles > 0) {
                NewsPaperDao newsPaperDao = new NewsPaperDaoImpl();
                isUpdated = newsPaperDao.updateNoOfArticlesByDate(noOfArticles,newspaperdate);
            }
            if (newspaperdate == null ) {
                throw new DateNotFoundException("please provide valid date");
            }
            if(noOfArticles <= 0)
            {
                throw new NoOfArticlesNotFoundException("Please provide valid articles");
            }
        }
        catch (DateNotFoundException | NoOfArticlesNotFoundException d)
        {
            d.printStackTrace();
        }

        return isUpdated;
    }

    @Override
    public void deleteNewsPaperById(Integer id) {
        try {
            if (id > 0) {
                NewsPaperDao newsPaperDao = new NewsPaperDaoImpl();
                newsPaperDao.deleteNewsPaperById(id);
            }
            if (id<=0) {
                throw new IdNotFoundException("please provide valid Id");
            }
        }
        catch (IdNotFoundException i)
        {
            i.printStackTrace();
        }
    }

    @Override
    public String getPaperNameById(Integer id) {
        String nname = null ;
        try {
            if (id > 0) {
                NewsPaperDao newsPaperDao = new NewsPaperDaoImpl();
                nname = newsPaperDao.getPaperNameById(id);
            }
            if (id<=0) {
                throw new IdNotFoundException("please provide valid Id");
            }
        }
        catch (IdNotFoundException i)
        {
            i.printStackTrace();
        }
        return nname;
    }

    @Override
    public String getPaperNameByLang(String lang) {
        String pName = null;
        try {
            if (lang != null) {
                NewsPaperDao newsPaperDao = new NewsPaperDaoImpl();
                pName = newsPaperDao.getPaperNameByLang(lang);
            }
            if (lang == null) {
                throw new LanguageNotFoundException("please provide valid language");
            }
        }
        catch (LanguageNotFoundException l)
        {
            l.printStackTrace();
        }
        return pName;
    }

    @Override
    public String getEditorNameByPaperName(String name) {
        String editor = null;
        try {
            if (name != null) {
                NewsPaperDao newsPaperDao = new NewsPaperDaoImpl();
                editor = newsPaperDao.getEditorNameByPaperName(name);
            }
            if (name == null) {
                throw new NameNotFoundException("please provide valid name");
            }
        }
        catch (NameNotFoundException n)
        {
            n.printStackTrace();
        }
        return editor;
    }
}
