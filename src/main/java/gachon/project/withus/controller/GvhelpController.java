package gachon.project.withus.controller;

import gachon.project.withus.controller.dao.IGvhelpDAO;
import gachon.project.withus.controller.dto.UserGvhelp.GetGvhelpRequestDTO;
import gachon.project.withus.controller.dto.UserGvhelp.GetGvhelpResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GvhelpController {
    @Autowired IGvhelpDAO IGvhelpDAO;
    //도와주기 화면
    @GetMapping("/gvhelp")
    public @ResponseBody List<GetGvhelpResponseDTO> gvhelp (
            @RequestParam(value = "board_lat") String board_lat,
            @RequestParam(value = "board_lng") String board_lng,
            @RequestParam(value = "board_addr") String board_addr,
            @RequestParam(value = "board_region1Depth") String board_region1Depth,
            @RequestParam(value = "board_region2Depth") String board_region2Depth) throws Exception{

        GetGvhelpRequestDTO requestDTO = new GetGvhelpRequestDTO(board_lat, board_lng, board_addr, board_region1Depth, board_region2Depth);
        List<GetGvhelpResponseDTO> list = IGvhelpDAO.gvhelp_list(requestDTO);

        return list;
    }
}
