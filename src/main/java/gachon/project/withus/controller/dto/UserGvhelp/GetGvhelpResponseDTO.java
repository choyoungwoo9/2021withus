package gachon.project.withus.controller.dto.UserGvhelp;

import lombok.Data;

@Data
public class GetGvhelpResponseDTO {
    //pk, auto_increment
    private String board_id;
    //글쓴이 이름
    private String board_writer;
    //게시글 제목
    private String board_title;
    //글 내용
    private String board_content;
    //글쓴 시간 (default currenttime)
    private String board_event_time;
    //카테고리(노약자, 어린이 등등)
    private String board_category;
    //봉사 시작일
    private String board_start_date;
    //봉사 종료일
    private String board_end_date;
    //위치정보(위도, 경도, 전체주소, level1주소, level2주소)
    private double board_lat;
    private double board_lng;
    private String board_addr;
    private String board_region1Depth;
    private String board_region2Depth;
    private String board_close;
    private String board_gvid;
    private String board_ndid;
}
