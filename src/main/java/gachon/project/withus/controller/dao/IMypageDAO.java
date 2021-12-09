package gachon.project.withus.controller.dao;

import gachon.project.withus.controller.dto.Mypage.GetMypageLogRequestDTO;
import gachon.project.withus.controller.dto.Mypage.GetMypageLogResponseDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IMypageDAO {
    public List<GetMypageLogResponseDTO> getndlog(String user_id, int start_index, int end_index);
    public List<GetMypageLogResponseDTO> getgvlog(String user_id, int start_index, int end_index);
    public List<GetMypageLogResponseDTO> getalllog(String user_id, int start_index, int end_index);

    //도움요청 게시물 개수 구하는 메소드
    public int ndlog_count(String user_id);
    //도와주기 게시물 개수 구하는 메소드
    public int gvlog_count(String user_id);
    //전체 게시물 개수 구하는 메소드
    public int alllog_count(String user_id);
}
