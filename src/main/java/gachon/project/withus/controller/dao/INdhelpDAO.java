package gachon.project.withus.controller.dao;

import gachon.project.withus.controller.dto.UserNdhelp.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface INdhelpDAO {
    //도움요청에 나오는 리스트
    public List<GetNdhelpResponseDTO> ndhelp_list(String board_category, int start_index, int end_index);
    //카테고리별 게시물 개수 구하는 메소드
    public int ndhelp_count(String board_category);
    //도움요청에 나오는 리스트(카테고리 : 전체)
    public List<GetNdhelpResponseDTO> ndhelp_all_list(int start_index, int end_index);
    //전체 게시물 개수 구하는 메소드(카테고리 : 전체)
    public int ndhelp_all_count();
    //도움요청 상세보기
    public GetNdhelpDetailResponseDTO ndhelpdetail_view(int board_id);
    //도움요청 글 수정하기(이전에 입력한 글 출력)
    public GetNdhelpDetailPutResponseDTO ndhelpdetail_put_view(int board_id);
    //도움요청 글 수정하기(수정후 확인버튼클릭)
    public int ndhelpdetail_put(String board_id, String board_writer, String board_title, String board_content, String board_category, String board_start_date, String board_end_date, String board_lat, String board_lng, String board_addr, String board_region1Depth, String board_region2Depth, String board_ndid);
    //도움요청 글 작성하기(작성후 확인버튼 클릭)
    public int ndhelp_write(String board_writer, String board_title, String board_content, String board_category, String board_start_date, String board_end_date, String board_lat, String board_lng, String board_addr, String board_region1Depth, String board_region2Depth, String board_ndid);
    //도움요청 글 삭제하기
    public int ndhelp_delete(String board_id);
    //매칭처리
    public int ndhelp_match(String board_id, String board_gvid);
    //매칭수락처리
    public int ndhelp_accept(String board_id);
    //매칭거절처리
    public int ndhelp_deny(String board_id);
    //채팅방 아이디 받기
    public GetNdhelpChatidResponseDTO ndhelp_chatid(int board_id);
    //채팅방 아이디 등록
    public int ndhelp_post_chatid(String board_id, String board_chatid);
}
