package gachon.project.withus.controller;

import gachon.project.withus.controller.dto.UserGvhelp.GetGvhelpRequestDTO;
import gachon.project.withus.controller.dto.UserGvhelp.GetGvhelpResponseDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GvhelpController {
    //도와주기 화면
    @GetMapping("/gvhelp")
    public @ResponseBody List<GetGvhelpResponseDTO> gvhelp(@RequestParam GetGvhelpRequestDTO RequestDTO) throws Exception{
        List<GetGvhelpResponseDTO> list;

        return list;
    }
}
