package gachon.project.withus.controller;

import gachon.project.withus.controller.dto.UserIndex.GetIndexResponseDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController {
    //인덱스화면
    @GetMapping("/")
    public @ResponseBody List<GetIndexResponseDTO> index() throws Exception{
        List<GetIndexResponseDTO> list;
        return list;
    }
}
