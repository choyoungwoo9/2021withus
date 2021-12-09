package gachon.project.withus.controller;

import gachon.project.withus.controller.dao.IMypageDAO;
import gachon.project.withus.controller.dto.Mypage.GetMypageLogRequestDTO;
import gachon.project.withus.controller.dto.Mypage.GetMypageLogResponseDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@CrossOrigin
@Controller
public class MypageController {

    @Autowired
    private IMypageDAO IMypageDAO;

    @GetMapping("/mypage/log")
    public @ResponseBody List<GetMypageLogResponseDTO> mypagelog(
            @RequestParam(value = "userid") String userid,
            @RequestParam(value = "mode") String mode,
            @RequestParam(value = "page") String page) throws Exception{
        GetMypageLogRequestDTO RequestDTO = new GetMypageLogRequestDTO(userid, page);
        List<GetMypageLogResponseDTO> list;
        //도움요청 신청이력 출력
        if(mode.equals("ndlog"))
        {
            System.out.println("메소드 : get /mypage/log "+"유저 아이디 : "+userid+"모드는 ndlog");
            list = IMypageDAO.getndlog(RequestDTO.getUserid(), ((Integer.parseInt(RequestDTO.getPage())-1)*3), (Integer.parseInt(RequestDTO.getPage())*3));
            GetMypageLogResponseDTO temp;
            temp = list.get(0);
            temp.setPage(page);
            temp.setTotalnum(Integer.toString(IMypageDAO.ndlog_count(RequestDTO.getUserid())));
        }//봉사하기 신청이력 출력
        else if(mode.equals("gvlog"))
        {
            System.out.println("메소드 : get /mypage/log "+"유저 아이디 : "+userid+"모드는 gvlog");
            list = IMypageDAO.getgvlog(RequestDTO.getUserid(), ((Integer.parseInt(RequestDTO.getPage())-1)*3), (Integer.parseInt(RequestDTO.getPage())*3));
            GetMypageLogResponseDTO temp;
            temp = list.get(0);
            temp.setPage(page);
            temp.setTotalnum(Integer.toString(IMypageDAO.gvlog_count(RequestDTO.getUserid())));
        }
        else//전체 신청이력 출력
        {
            System.out.println("메소드 : get /mypage/log "+"유저 아이디 : "+userid+"모드는 alllog");
            list = IMypageDAO.getalllog(RequestDTO.getUserid(), ((Integer.parseInt(RequestDTO.getPage())-1)*3), (Integer.parseInt(RequestDTO.getPage())*3));
            GetMypageLogResponseDTO temp;
            temp = list.get(0);
            temp.setPage(page);
            temp.setTotalnum(Integer.toString(IMypageDAO.alllog_count(RequestDTO.getUserid())));
        }

        return list;

    }

}
