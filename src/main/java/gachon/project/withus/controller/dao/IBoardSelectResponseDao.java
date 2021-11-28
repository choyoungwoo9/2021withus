package gachon.project.withus.controller.dao;

import gachon.project.withus.controller.dto.BoardSelectResponseDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IBoardSelectResponseDao {
    List<BoardSelectResponseDTO> list();
}
