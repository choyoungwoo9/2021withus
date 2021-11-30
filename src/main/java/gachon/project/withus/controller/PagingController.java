package gachon.project.withus.controller;

import gachon.project.withus.controller.dao.IBoardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PagingController {

    @Autowired
    private IBoardDao IBoardDao;
    //게시판 조회

    @RequestMapping("/board/list")
    public @ResponseBody String board_detail() throws Exception{

        System.out.println(IBoardDao.list());

        return "list";
    }
    @GetMapping("/board/select/{id}")
    public @ResponseBody String board_select(@PathVariable String id) throws Exception{

        System.out.println(IBoardDao.view(id));

        return "select";
    }
    //게시판 글 등록
    @RequestMapping("/board/post")
    public @ResponseBody String board_post() throws Exception{

        System.out.println(IBoardDao.write
                ("조영우", "조영우타이틀", "조영우 내용", "노약자"));
        System.out.println(IBoardDao.list());
        return "post";
    }
    //게시판 삭제
    @RequestMapping("/board/delete")
    public @ResponseBody String board_delete() throws Exception{
        System.out.println(IBoardDao.delete("2"));
        System.out.println(IBoardDao.list());
        return "delete";
    }
    //게시판 수정
    @RequestMapping("/board/put")
    public @ResponseBody String board_put() throws Exception{

        return "put";
    }
}
