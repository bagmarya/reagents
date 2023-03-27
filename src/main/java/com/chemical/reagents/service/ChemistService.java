package com.chemical.reagents.service;

import com.chemical.reagents.dao.ChemistDao;
import com.chemical.reagents.dto.ChemistInfoDto;
import com.chemical.reagents.entity.Chemist;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ChemistService {

  private final ChemistDao chemistDao;

  public ChemistService(ChemistDao chemistDao) {
    this.chemistDao = chemistDao;
  }

  @Transactional
  public Chemist getChemistById(int id) {
    return chemistDao.getById(id);
  }


  public List<ChemistInfoDto> chemistInfoDtoList() {
    return chemistDao.chemistInfoDtoList();
  }
}
