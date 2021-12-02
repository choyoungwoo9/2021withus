package gachon.project.withus.controller.dao;

import gachon.project.withus.controller.dto.UserIndex.GetIndexRequestDTO;
import gachon.project.withus.controller.dto.UserIndex.GetIndexResponseDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IIndexDAO {
    //인덱스 화면에 나오는 리스트
    public List<GetIndexResponseDTO> index_list(GetIndexRequestDTO RequestDTO);
}
