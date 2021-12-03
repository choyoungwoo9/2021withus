package gachon.project.withus.controller.dao;

import gachon.project.withus.controller.dto.UserNdhelp.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface INdhelpDAO {
    //도움요청에 나오는 리스트
    public List<GetNdhelpResponseDTO> ndhelp_list(String board_category, int start_index, int end_index, String keyword);
    //도움요청 상세보기
    public GetNdhelpDetailResponseDTO ndhelpdetail_view(int board_id);
    //도움요청 글 수정하기(이전에 입력한 글 출력)
    public GetNdhelpDetailPutResponseDTO ndhelpdetail_put_view(int board_id);
    //도움요청 글 수정하기(수정후 확인버튼클릭)
    public int ndhelpdetail_put(String board_id, String board_writer, String board_title, String board_content, String board_category, String board_start_date, String board_end_date, String board_lat, String board_lng, String board_addr, String board_region1Depth, String board_region2Depth);
    //도움요청 글 작성하기(작성후 확인버튼 클릭)
    public int ndhelp_write(String board_writer, String board_title, String board_content, String board_category, String board_start_date, String board_end_date, String board_lat, String board_lng, String board_addr, String board_region1Depth, String board_region2Depth);
    //도움요청 글 삭제하기
    public int ndhelp_delete(String board_id);
}
