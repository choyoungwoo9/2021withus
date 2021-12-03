package gachon.project.withus.controller;

import gachon.project.withus.controller.dao.INdhelpDAO;
import gachon.project.withus.controller.dto.UserNdhelp.*;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class NdhelpController {

    @Autowired INdhelpDAO INdhelpDAO;

    //도움요청 메인화면
    @GetMapping("/ndhelp")
    public @ResponseBody List<GetNdhelpResponseDTO> get_ndhelp(
            @RequestParam(value = "board_category") String board_category,
            @RequestParam(value = "page") String page,
            @RequestParam(value = "keyword") String keyword) throws Exception{
        GetNdhelpRequestDTO RequestDTO = new GetNdhelpRequestDTO(board_category, page, keyword);

        System.out.println("어린이"+RequestDTO.getBoard_category());

        List<GetNdhelpResponseDTO> list = INdhelpDAO.ndhelp_list(RequestDTO.getBoard_category(),((Integer.parseInt(RequestDTO.getPage())-1)*9), (Integer.parseInt(RequestDTO.getPage())*9), RequestDTO.getKeyword());
        
        //페이징
        return list;
    }

    //도움요청 상세보기 화면//수정필요
    @GetMapping("/ndhelp/detail")
    public @ResponseBody
    GetNdhelpDetailResponseDTO get_ndhelp_detail(
            @RequestParam(value = "board_id") String board_id) throws Exception{
        GetNdhelpDetailRequestDTO RequestDTO = new GetNdhelpDetailRequestDTO(board_id);
        GetNdhelpDetailResponseDTO ResponseDTO = INdhelpDAO.ndhelpdetail_view(Integer.parseInt(RequestDTO.getBoard_id()));
        return ResponseDTO;
    }

    //도움요청 글 수정하기(이전에 입력한 글 출력)//수정필요
    @GetMapping("/ndhelp/detail/put")
    public @ResponseBody
    GetNdhelpDetailPutResponseDTO get_ndhelp_detail_put(
            @RequestParam(value = "board_id") String board_id) throws Exception{
        GetNdhelpDetailPutRequestDTO RequestDTO = new GetNdhelpDetailPutRequestDTO(board_id);

        GetNdhelpDetailPutResponseDTO ResponseDTO = INdhelpDAO.ndhelpdetail_put_view(Integer.parseInt(RequestDTO.getBoard_id()));
        return ResponseDTO;
    }

    //도움요청 글 수정하기(수정할 내용입력후 확인)
    @PostMapping("/ndhelp/detail/put")
    public @ResponseBody
    int post_ndhelp_detail_put(@RequestBody PostNdhelpDetailPutRequestDTO RequestDTO) throws Exception{
        System.out.println(RequestDTO);
        int check = INdhelpDAO.ndhelpdetail_put(RequestDTO.getBoard_id(), RequestDTO.getBoard_writer(), RequestDTO.getBoard_title(), RequestDTO.getBoard_content(), RequestDTO.getBoard_category(), RequestDTO.getBoard_start_date(), RequestDTO.getBoard_end_date(), RequestDTO.getBoard_lat(), RequestDTO.getBoard_lng(), RequestDTO.getBoard_addr(), RequestDTO.getBoard_region1Depth(), RequestDTO.getBoard_region2Depth());
        return check;
    }

    //도움요청 글 작성하기
    @PostMapping("/ndhelp/write")
    public @ResponseBody
    int post_ndhelp_write(@RequestBody PostNdhelpWriteRequestDTO RequestDTO) throws Exception{

        int check = INdhelpDAO.ndhelp_write(RequestDTO.getBoard_writer(), RequestDTO.getBoard_title(), RequestDTO.getBoard_content(), RequestDTO.getBoard_category(), RequestDTO.getBoard_start_date(), RequestDTO.getBoard_end_date(), RequestDTO.getBoard_lat(), RequestDTO.getBoard_lng(), RequestDTO.getBoard_addr(), RequestDTO.getBoard_region1Depth(), RequestDTO.getBoard_region2Depth());
        return check;
    }

    //도움요청 글 삭제하기
    @PostMapping("/ndhelp/delete")
    public @ResponseBody
    int post_ndhelp_delete(@RequestBody PostNdhelpDeleteRequestDTO RequestDTO) throws Exception{
        int check = INdhelpDAO.ndhelp_delete(RequestDTO.getBoard_id());
        return check;
    }
}
