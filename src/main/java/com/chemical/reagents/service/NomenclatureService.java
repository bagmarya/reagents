package com.chemical.reagents.service;

import com.chemical.reagents.dao.NomenclatureDao;
import com.chemical.reagents.dto.NomenclatureInfoDto;
import com.chemical.reagents.entity.Nomenclature;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class NomenclatureService {

  private final NomenclatureDao nomenclatureDao;

  public NomenclatureService(NomenclatureDao nomenclatureDao) {
    this.nomenclatureDao = nomenclatureDao;
  }

  public void saveNomenclature(Nomenclature nomenclature) {
    nomenclatureDao.save(nomenclature);
  }

  public List<NomenclatureInfoDto> nomenclatureInfoDtoList() {
    return nomenclatureDao.nomenclatureInfoDtoList();
  }


}