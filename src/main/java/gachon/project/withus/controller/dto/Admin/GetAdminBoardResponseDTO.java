package gachon.project.withus.controller.dto.Admin;

import lombok.Data;

@Data
public class GetAdminBoardResponseDTO {
    //pk, auto_increment
    private String board_id;
    //글쓴이 이름
    private String board_writer;
    //카테고리(노약자, 어린이 등등)
    private String board_category;
    //게시글 제목
    private String board_title;
    //현재페이지
    private String page;
    //전체게시물개수
    private String totalnum;
}
