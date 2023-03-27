package com.chemical.reagents.dao;

import com.chemical.reagents.dto.ChemistInfoDto;
import com.chemical.reagents.entity.Chemist;
import java.util.List;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ChemistDao
{
  private static final Logger logger = LoggerFactory.getLogger(ChemistDao.class);

  private SessionFactory sessionFactory;

  public ChemistDao(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }


  @Transactional
  public Chemist getById(int id) {
    return sessionFactory.getCurrentSession().get(Chemist.class, id);
  }

  @Transactional
  public Chemist getByIdId(Integer Id) {
    return sessionFactory.getCurrentSession().createQuery("select c from Chemist c where c.id = :id", Chemist.class)
        .setParameter("id", Id).getSingleResult();
  }

  public List<ChemistInfoDto> chemistInfoDtoList(){
    return sessionFactory.getCurrentSession()
        .createQuery("select new com.chemical.reagents.dto.ChemistInfoDto(ch.login, ch.name, ch.role) " +
            "from Chemist ch", ChemistInfoDto.class).getResultList();
  }

}
