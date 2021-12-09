package gachon.project.withus.controller.dto.Mypage;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetMypageLogRequestDTO {
    //유저 id
    String userid;
    String page;
}
