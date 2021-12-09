package gachon.project.withus.controller.dto.UserNdhelp;

import lombok.Data;

@Data
public class PostNdhelpMatchRequestDTO {
    //pk, auto_increment
    private String board_id;
    //봉사하는 사람 아이디
    private String board_gvid;
}
