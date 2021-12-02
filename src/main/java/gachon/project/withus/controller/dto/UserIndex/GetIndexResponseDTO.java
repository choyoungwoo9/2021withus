package gachon.project.withus.controller.dto.UserIndex;

import lombok.Data;

@Data
public class GetIndexResponseDTO {
    //pk, auto_increment
    private String board_id;
    //글쓴이 이름
    private String board_writer;
    //카테고리(노약자, 어린이 등등)
    private String board_category;
    //게시글 제목
    private String board_title;
}
