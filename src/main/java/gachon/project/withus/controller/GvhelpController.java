package gachon.project.withus.controller;

import gachon.project.withus.controller.dao.IGvhelpDAO;
import gachon.project.withus.controller.dto.UserGvhelp.GetGvhelpResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@CrossOrigin
@Controller
public class GvhelpController {
    @Autowired IGvhelpDAO IGvhelpDAO;
    //도와주기 화면
    @GetMapping("/gvhelp")
    public @ResponseBody List<GetGvhelpResponseDTO> gvhelp () throws Exception{

        System.out.println("메소드 : get /gvhelp");
        List<GetGvhelpResponseDTO> list = IGvhelpDAO.gvhelp_list();

        return list;
    }
}
