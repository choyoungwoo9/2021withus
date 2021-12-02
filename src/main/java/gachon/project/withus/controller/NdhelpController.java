package gachon.project.withus.controller;

import gachon.project.withus.controller.dto.UserNdhelp.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class NdhelpController {
    //도움요청 메인화면
    @GetMapping("/ndhelp")
    public @ResponseBody List<GetNdhelpResponseDTO> get_ndhelp() throws Exception{
        List<GetNdhelpResponseDTO> list;

        return list;
    }

    //도움요청 상세보기 화면
    @GetMapping("/ndhelp/detail")
    public @ResponseBody
    GetNdhelpDetailResponseDTO get_ndhelp_detail(@RequestParam GetNdhelpRequestDTO RequestDTO) throws Exception{
        GetNdhelpResponseDTO ResponseDTO;

        return ResponseDTO;
    }

    //도움요청 글 수정하기(이전에 입력한 글 출력)
    @GetMapping("/ndhelp/detail/put")
    public @ResponseBody
    GetNdhelpDetailPutResponseDTO get_ndhelp_detail_put(@RequestParam GetNdhelpDetailPutRequestDTO RequestDTO) throws Exception{
        GetNdhelpDetailPutResponseDTO ResponseDTO;

        return ResponseDTO;
    }

    //도움요청 글 수정하기(수정할 내용입력후 확인)
    @PostMapping("/ndhelp/detail/put")
    public @ResponseBody
    PostNdhelpDetailPutResponseDTO post_ndhelp_detail_put(@RequestBody PostNdhelpDetailPutRequestDTO RequestDTO) throws Exception{
        PostNdhelpDetailPutResponseDTO ResponseDTO;

        return ResponseDTO;
    }

    //도움요청 글 작성하기
    @PostMapping("/ndhelp/write")
    public @ResponseBody
    PostNdhelpWriteResponseDTO post_ndhelp_write(@RequestBody PostNdhelpWriteRequestDTO RequestDTO) throws Exception{
        PostNdhelpWriteResponseDTO ResponseDTO;

        return ResponseDTO;
    }

    //도움요청 글 삭제하기
    @PostMapping("/ndhelp/delete")
    public @ResponseBody
    PostNdhelpDeleteResponseDTO post_ndhelp_delete(@RequestBody PostNdhelpDeleteRequestDTO RequestDTO) throws Exception{
        PostNdhelpDeleteResponseDTO ResponseDTO;

        return ResponseDTO;
    }
}
