package gachon.project.withus.controller;

import gachon.project.withus.controller.dao.IBoardDao;
import gachon.project.withus.controller.dto.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PagingController {

    @Autowired
    private IBoardDao IBoardDao;

    //게시판 조회
    @RequestMapping("/board/list")
    public @ResponseBody List<BoardDTO> board_list() throws Exception{

        List<BoardDTO> list = IBoardDao.list();

        return list;
    }
    //게시판 글 내용보기
    @GetMapping("/board/select/{id}")
    public @ResponseBody BoardDTO board_select(@PathVariable String id) throws Exception{

        BoardDTO BoardDTO = IBoardDao.view(id);
        System.out.println(BoardDTO);

        return BoardDTO;
    }
    //게시판 글 등록
    @PostMapping("/board/post")
    public  @ResponseBody List<BoardDTO> board_post(@RequestBody BoardDTO dto) throws Exception{

        //request로 받음
        System.out.println(dto);
        
        IBoardDao.write("조영우", "조영우타이틀", "조영우 내용", "노약자");
        List<BoardDTO> list = IBoardDao.list();

        return list;
    }
    //게시판 삭제
    @PostMapping("/board/delete")
    public @ResponseBody List<BoardDTO> board_delete(@RequestBody BoardDTO dto) throws Exception{

        System.out.println(IBoardDao.delete("2"));
        List<BoardDTO> list = IBoardDao.list();

        return list;
    }
    //게시판 수정
    @RequestMapping("/board/put")
    public @ResponseBody String board_put() throws Exception{

        return "put";
    }
}
