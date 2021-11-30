package gachon.project.withus.controller.dto;

import lombok.Data;

//게시글 DTO
@Data
public class BoardDTO {
    //pk, auto_increment
    private String board_id;
    //글쓴이 이름(세션에서 얻어야 할듯)
    private String board_writer;
    //게시글
    private String board_title;
    //글 내용
    private String board_content;
    //글쓴 시간 (default currenttime)
    private String board_event_time;
    //삭제여부(0 = false(삭제됨), 1 = true(삭제안됨)) default 1
    private String board_deleteYN;
    //카테고리(노약자, 어린이 등등)
    private String board_category;
    //봉사 시작일
    private String board_start_date;
    //봉사 종료일
    private String board_end_date;
    //위치정보(위도, 경도, 전체주소, level1주소, level2주소)
    private String board_lat;
    private String board_lng;
    private String board_addr;
    private String board_region1Depth;
    private String board_region2Depth;
}
