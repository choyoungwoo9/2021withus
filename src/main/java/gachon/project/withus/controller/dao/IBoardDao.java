package gachon.project.withus.controller.dao;

import gachon.project.withus.controller.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IBoardDao {
    public List<BoardDTO> list(); //게시판 리스트 보냄
    public BoardDTO view(String board_id); //게시글 보기
    public int write //게시판 글 작성
            (String board_writer, String board_title, String board_content, String board_category);
    public int delete(String board_id);
}
