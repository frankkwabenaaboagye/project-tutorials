package com.frankaboagye.connecthub.controlllers;

import com.frankaboagye.connecthub.repositories.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequiredArgsConstructor
public class CompanyController {

//    private final StorageServiceInterface storageServiceImplementation; // it will use the FileSystemStorageService .. since that is what has been configured
    private final CompanyRepository companyRepository;


    @GetMapping("/register-company")
    public String registerCompany(ModelMap modelMap){
        return "registerCompany";
    }
//
//    @PostMapping("/handle-register-company")
//    public String handleCompanyRegisteration(
//            @ModelAttribute CompanyDAO companyDAO,
//            @RequestParam("companyPhotoFile") MultipartFile companyPhotoFile,
//            ModelMap modelMap
//    ){
//
//        // use aspect over here
//        // we can do some serious checks
//        // logging
//
//
//        // compare the passwords... although we are doing it with js at the view side
//
//        if(!companyDAO.getPassword().equals(companyDAO.getConfirmPassword())){
//            modelMap.addAttribute("message", "registration failed - passwords do not match");
//            return "registerCompany";
//        }
//
//        try {
//            storageServiceImplementation.store(companyPhotoFile);
//
//            Company newCompany = Company.builder()
//                    .email(companyDAO.getEmail())
//                    .name(companyDAO.getName())
//                    .phonenumber(companyDAO.getPhonenumber())
//                    .website(companyDAO.getWebsite())
//                    .password(companyDAO.getPassword())
//                    .profilepicturename(companyPhotoFile.getOriginalFilename())
//                    .description(companyDAO.getDescription())
//                    .build();
//
//            companyServiceImplementation.registerCompany(newCompany);
//
//            modelMap.addAttribute("message", "registration successful");
//
//            return "loginCompany";
//        } catch (Exception e) {
//            modelMap.addAttribute("message", "registration failed");
//            return "registerCompany";
//        }
//
//    }
//
//    @GetMapping("/login-company")
//    public String loginCompany(){
//        return "loginCompany";
//    }
//
//    @PostMapping("/handle-login-company")
//    public String handleCompanyLogin(
//            @RequestParam("email") String email,
//            @RequestParam("password") String password,
//            ModelMap modelMap,
//            HttpSession httpSession,
//            RedirectAttributes redirectAttributes
//    ){
//
//        Optional<Company> companyData = companyServiceImplementation.loginCompany(email, password);
//        if(companyData.isPresent()){
//            Company company = companyData.get();
//
//            httpSession.setAttribute(SESSION_DATA.getDescription(), company.getId());  // e.g. ("sessionData", 29919)
//            httpSession.setAttribute(PROFILE.getDescription(), COMPANY.getValue());  // e.g. ("company", company)
//
//            return "redirect:/companyHomepage";
//
//        }
//        modelMap.addAttribute("errorMessage", "Login Failed, Try Again");
//        return "loginCompany";
//
//    }
//
//
//    @GetMapping("/logout-company")
//    public String logoutCompany(HttpSession httpSession){
//        httpSession.invalidate();
//        return "loginCompany";
//    }
//
////    @GetMapping("/companyHomepage")
////    public String getCompanyHompage(HttpSession httpSession, ModelMap modelMap){
////
////        String sessionData = (String) httpSession.getAttribute(SESSION_DATA.getDescription());
////        if(sessionData == null){ return "redirect:/login-company"; }
////
////        Company company = companyRepository.findById(Long.parseLong(sessionData)).orElse(null);
////
////        if(company != null){
////            List<Job> companyJobs = jobRepository.findAllByCompany_Id(company.getId());
////            List<Project> companyProjects = projectRepository.findAllByCompany_Id(company.getId());
////
////            modelMap.addAttribute("company", company);
////            modelMap.addAttribute("companyJobs", companyJobs);
////            modelMap.addAttribute("companyProjects", companyProjects);
////            modelMap.addAttribute("profile", company);
////
////            httpSession.setAttribute(SESSION_DATA.getDescription(), company.getId());  // e.g. ("sessionData", 29919)
////            httpSession.setAttribute(PROFILE.getDescription(), COMPANY.getValue());  // e.g. ("company", company)
////
////        } else {
////            return "redirect:/login-company";
////        }
////
////
////        return "companyHomepage";
////    }
//
//
//    @GetMapping("/companyProfilepage/{companyId}")
//    public String getCompanyProfilePage(@PathVariable("companyId") Long companyId, HttpSession httpSession, ModelMap modelMap) throws IOException {
//
//
//        Optional<Company> companyOptional = companyRepository.findById(companyId);
//
//        if(companyOptional.isEmpty()){ return "redirect:/loginCompany"; }
//
//        Company theCompany = companyOptional.get();
//
//        Path path = storageServiceImplementation.load(theCompany.getProfilepicturename());
//        String profileSrc = MvcUriComponentsBuilder
//                .fromMethodName(FileUploadController.class, "serveFile", path.getFileName().toString())
//                .build()
//                .toUri()
//                .toString();
//
//        modelMap.addAttribute("company", theCompany);
//        modelMap.addAttribute("profilePicturePath", profileSrc);
//
//        httpSession.setAttribute("sessionData", theCompany.getEmail());
//        httpSession.setAttribute("companyData", theCompany);
//
//        return "companyProfilepage";
//
//    }
//
//    @PostMapping("/handle-company-profile-update/{id}")
//    public String updateCompanyProfile(
//            @PathVariable(name = "id") Long companyId,
//            @ModelAttribute CompanyDTO companyDTO,
//            @RequestParam("companyPhotoFile") MultipartFile companyPhotoFile,
//            ModelMap modelMap,
//            HttpSession httpSession
//    ){
//
//        boolean updateFile =  false;
//
//        if(!companyPhotoFile.isEmpty()){updateFile = true;}
//
//        Company company = companyServiceImplementation.updateCompany(companyId, companyDTO, updateFile,companyPhotoFile);
//        modelMap.addAttribute("message", "update successful");
//
//        modelMap.addAttribute("company", company);
//
//        httpSession.setAttribute("sessionData",company.getEmail());
//        httpSession.setAttribute("companyData", company);
//
//        return "redirect:/companyProfilepage/" + company.getId();
//
//    }
//
//
//
//
//    // will delete later - for dev purpose
//    public Company getCisco(){
//        Optional<Company> co =  companyRepository.findByEmailAndPassword("cisco@gmail.com", "cisco");
//        return co.orElse(null);
//
//    }
//
//
}
