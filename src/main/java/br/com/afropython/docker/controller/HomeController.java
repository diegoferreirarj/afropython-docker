package br.com.afropython.docker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
import java.sql.SQLException;

@Controller
public class HomeController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "home";
    }

    @GetMapping("/mysql")
    @ResponseBody
    public String mysql() throws SQLException {
        return dataSource.getConnection().getMetaData().getTimeDateFunctions();
    }

}
