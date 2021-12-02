package gachon.project.withus.controller.dao;

import gachon.project.withus.controller.dto.UserNdhelp.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface INdhelpDAO {
    //도움요청에 나오는 리스트
    public List<GetNdhelpResponseDTO> ndhelp_list(GetNdhelpRequestDTO RequestDTO);
    //도움요청 상세보기
    public GetNdhelpDetailResponseDTO ndhelpdetail_view(GetNdhelpDetailRequestDTO RequestDTO);
    //도움요청 글 수정하기(이전에 입력한 글 출력)
    public GetNdhelpDetailPutResponseDTO ndhelpdetail_put_view(GetNdhelpDetailPutRequestDTO RequestDTO);
    //도움요청 글 수정하기(수정후 확인버튼클릭)
    public PostNdhelpDetailPutResponseDTO ndhelpdetail_put(PostNdhelpDetailPutRequestDTO RequestDTO);
    //도움요청 글 삭제하기
    public PostNdhelpDeleteResponseDTO ndhelpdetail_delete(PostNdhelpDeleteRequestDTO RequestDTO);
}
