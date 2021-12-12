package gachon.project.withus.controller.dto.UserNdhelp;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PostNdhelpDetailPutRequestDTO {
    //pk, auto_increment
    private String board_id;
    //글쓴이 이름
    private String board_writer;
    //게시글 제목
    private String board_title;
    //글 내용
    private String board_content;
    //카테고리(노약자, 어린이 등등)
    private String board_category;
    //봉사 시작일
    private LocalDateTime board_start_date;
    //봉사 종료일
    private LocalDateTime board_end_date;
    //위치정보(위도, 경도, 전체주소, level1주소, level2주소)
    private String board_lat;
    private String board_lng;
    private String board_addr;
    private String board_region1Depth;
    private String board_region2Depth;

    private String board_ndid;
}
