package gachon.project.withus.controller;

import gachon.project.withus.controller.dao.IBoardSelectResponseDao;
import gachon.project.withus.controller.dto.BoardSelectResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PagingController {

    @Autowired
    private IBoardSelectResponseDao selectResponseDao;
    //게시판 조회

    @RequestMapping("/board/select")
    public @ResponseBody String board_select() throws Exception{

        System.out.print(selectResponseDao.list());

        return "db";
    }
    //게시판 글 등록
    @RequestMapping("/board/post")
    public @ResponseBody String board_post() throws Exception{
        return "ss";
    }
    //게시판 삭제
    @RequestMapping("/board/delete")
    public @ResponseBody String board_delete() throws Exception{
        return "ss";
    }
    //게시판 수정
    @RequestMapping("/board/put")
    public @ResponseBody String board_put() throws Exception{
        return "ss";
    }
}
