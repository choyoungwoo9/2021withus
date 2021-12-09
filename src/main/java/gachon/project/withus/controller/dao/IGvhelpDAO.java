package gachon.project.withus.controller.dao;

import gachon.project.withus.controller.dto.UserGvhelp.GetGvhelpResponseDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IGvhelpDAO {
    public List<GetGvhelpResponseDTO> gvhelp_list();
}
