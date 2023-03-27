package com.chemical.reagents.dao;


import com.chemical.reagents.dto.ChemistInfoDto;
import com.chemical.reagents.dto.NomenclatureInfoDto;
import com.chemical.reagents.entity.Chemist;
import com.chemical.reagents.entity.Nomenclature;
import java.util.List;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class NomenclatureDao {

  private static final Logger logger = LoggerFactory.getLogger(NomenclatureDao.class);
  private SessionFactory sessionFactory;

  public NomenclatureDao(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  public Nomenclature getById(Integer id) {
    return sessionFactory.getCurrentSession().get(Nomenclature.class, id);
  }

  public List<NomenclatureInfoDto> nomenclatureInfoDtoList(){
    return sessionFactory.getCurrentSession()
        .createQuery("select new com.chemical.reagents.dto.NomenclatureInfoDto(" +
            "n.id, n.name, n.normativeDoc, n.requirements, n.unit, n.price, n.description) " +
            "from Nomenclature n", NomenclatureInfoDto.class).getResultList();
  }


  public void save(Nomenclature nomenclature) {
    sessionFactory.getCurrentSession().saveOrUpdate(nomenclature);
  }
}
