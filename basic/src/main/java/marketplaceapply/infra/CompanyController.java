package marketplaceapply.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import marketplaceapply.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/companies")
@Transactional
public class CompanyController {

    @Autowired
    CompanyRepository companyRepository;

    @RequestMapping(
        value = "companies/{id}/companycreated",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Company companyCreated1(
        @PathVariable(value = "id") Long id,
        @RequestBody CompanyCreated1Command companyCreated1Command,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /company/companyCreated1  called #####");
        Optional<Company> optionalCompany = companyRepository.findById(id);

        optionalCompany.orElseThrow(() -> new Exception("No Entity Found"));
        Company company = optionalCompany.get();
        company.companyCreated1(companyCreated1Command);

        companyRepository.save(company);
        return company;
    }
}
//>>> Clean Arch / Inbound Adaptor
