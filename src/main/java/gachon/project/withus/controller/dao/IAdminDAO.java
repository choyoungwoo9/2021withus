package gachon.project.withus.controller.dao;

import gachon.project.withus.controller.dto.Admin.GetAdminBoardResponseDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IAdminDAO {
    //게시판 리스트
    public List<GetAdminBoardResponseDTO> admin_board_list(String board_category, int start_index, int end_index);
    public List<GetAdminBoardResponseDTO> admin_board_all_list(int start_index, int end_index);
    //게시글 삭제
    public int admin_board_delete(String board_id);

}
