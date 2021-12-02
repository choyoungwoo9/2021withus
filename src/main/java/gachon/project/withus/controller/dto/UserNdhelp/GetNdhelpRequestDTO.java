package gachon.project.withus.controller.dto.UserNdhelp;

import lombok.Data;

@Data
public class GetNdhelpRequestDTO {
    //카테고리(노약자, 어린이 등등)
    private String board_category;
    //도움요청 게시판 페이지네이션 번호
    private String page;
    //도움요청 검색 키워드
    private String keyword;
}
