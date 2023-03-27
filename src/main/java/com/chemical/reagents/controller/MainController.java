package com.chemical.reagents.controller;

import com.chemical.reagents.dao.ChemistDao;
import com.chemical.reagents.dto.ChemistInfoDto;
import com.chemical.reagents.dto.NomenclatureInfoDto;
import com.chemical.reagents.entity.Nomenclature;
import com.chemical.reagents.form.NomenclatureForm;
import com.chemical.reagents.service.ChemistService;
import com.chemical.reagents.service.NomenclatureService;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

  private static Integer currentUser = 1;

  @Autowired
  private ChemistDao chemistDao;

  @Autowired
  private ChemistService chemistService;
  @Autowired
  private NomenclatureService nomenclatureService;

  @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
  public String index(Model model) {
    //    SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
//    Calendar cal = Calendar.getInstance();
    model.addAttribute("today", Calendar.getInstance());
    return "index";
  }

  @RequestMapping(value = "/chemist", method = RequestMethod.GET)
  public String showAccounts(Model model) {
    List<ChemistInfoDto> list = chemistService.chemistInfoDtoList();
    model.addAttribute("accountInfos", list);
    return "accountsPage";
  }

  @RequestMapping(value = "/nomenclature", method = RequestMethod.GET)
  public String showNomenclature(Model model) {
    List<NomenclatureInfoDto> list = nomenclatureService.nomenclatureInfoDtoList();
    model.addAttribute("nomenclatureInfos", list);
    return "nomenclaturePage";
  }

  @RequestMapping(value = { "/addNomenclature" }, method = RequestMethod.GET)
  public String showAddNomenclaturePage(Model model) {
    NomenclatureForm nomenclatureForm = new NomenclatureForm();
    model.addAttribute("nomenclatureForm", nomenclatureForm);
    return "addNomenclaturePage";
  }

  @RequestMapping(value = {"/addNomenclature"}, method = RequestMethod.POST)
  public String saveNomenclature (Model model,
                                  @ModelAttribute("nomenclatureForm")
                                      NomenclatureForm nomenclatureForm) {
    String name = nomenclatureForm.getName();
    String normativeDoc = nomenclatureForm.getNormativeDoc();
    String requirements = nomenclatureForm.getRequirements();
    String unit = nomenclatureForm.getUnit();
    Integer price = nomenclatureForm.getPrice();
    String description = nomenclatureForm.getDescription();
    Integer creatorId = currentUser;

//todo: перенести этот кусок в сервисный слой

    if (name != null && name.length() > 0 //
        && unit != null && unit.length() > 0) {
      Nomenclature newNomenclature = new Nomenclature(name, normativeDoc, requirements, unit, price, description, creatorId);
      nomenclatureService.saveNomenclature(newNomenclature);

      return "redirect:/nomenclature";
    }
    return "addNomenclaturePage";
  }

}
