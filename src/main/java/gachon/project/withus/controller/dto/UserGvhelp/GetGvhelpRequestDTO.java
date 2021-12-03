package gachon.project.withus.controller.dto.UserGvhelp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetGvhelpRequestDTO {
    //위치정보(위도, 경도, 전체주소, level1주소, level2주소)
    private String board_lat;
    private String board_lng;
    private String board_addr;
    private String board_region1Depth;
    private String board_region2Depth;
}
