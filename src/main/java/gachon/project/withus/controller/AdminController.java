package gachon.project.withus.controller;

import gachon.project.withus.controller.dao.IAdminDAO;
import gachon.project.withus.controller.dto.Admin.GetAdminBoardRequestDTO;
import gachon.project.withus.controller.dto.Admin.GetAdminBoardResponseDTO;
import gachon.project.withus.controller.dto.Admin.PostAdminBoardDeleteRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Controller
public class AdminController {

    @Autowired IAdminDAO IAdminDAO;

    @GetMapping("/admin/board")
    public @ResponseBody
    List<GetAdminBoardResponseDTO> get_admin_board(
            @RequestParam(value = "board_category") String board_category,
            @RequestParam(value = "page") String page) throws Exception{
        GetAdminBoardRequestDTO RequestDTO = new GetAdminBoardRequestDTO(board_category, page);

        if(board_category.equals("전체")){
            System.out.println("메소드 : get /ndhelp 카테고리 : "+board_category+"page : "+page);
            List<GetAdminBoardResponseDTO> list = IAdminDAO.admin_board_all_list(((Integer.parseInt(RequestDTO.getPage())-1)*9), (Integer.parseInt(RequestDTO.getPage())*9));
            return list;
        }

        System.out.println("메소드 : get /ndhelp 카테고리 : "+board_category+"page : "+page);
        List<GetAdminBoardResponseDTO> list = IAdminDAO.admin_board_list(RequestDTO.getBoard_category(),((Integer.parseInt(RequestDTO.getPage())-1)*10), (Integer.parseInt(RequestDTO.getPage())*10));
        return list;
    }

    @PostMapping("admin/board/delete")
    public @ResponseBody
    int post_board_delete(@RequestBody PostAdminBoardDeleteRequestDTO RequestDTO) throws Exception{

        System.out.println("메소드 : post /admin/board/delete +"+RequestDTO);
        int check = IAdminDAO.admin_board_delete(RequestDTO.getBoard_id());
        return 1;
    }
}
