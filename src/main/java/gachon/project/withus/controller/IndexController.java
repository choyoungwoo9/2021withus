package gachon.project.withus.controller;

import gachon.project.withus.controller.dao.IIndexDAO;
import gachon.project.withus.controller.dto.UserIndex.GetIndexResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@Controller
public class IndexController {

    @Autowired
    private IIndexDAO IIndexDAO;

    //인덱스화면
    @GetMapping("/")
    public @ResponseBody List<GetIndexResponseDTO> index() throws Exception{

        System.out.println("메소드 : get /");
        List<GetIndexResponseDTO> list = IIndexDAO.index_list();
        return list;
    }
}
