package int221.nw2.project.yuuuhooo.controllers;


import int221.nw2.project.yuuuhooo.entities.Category;
import int221.nw2.project.yuuuhooo.services.categoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:5173", "http://intproj22.sit.kmutt.ac.th"})
public class categoryController {
    @Autowired
    private categoryService categoryService;

    @GetMapping("/categories")
    public List<Category> getAllCategory() {
        return categoryService.getAllCategory();
    }

    @GetMapping("/categories/{id}")
    public Category getCategoryById(@PathVariable int id) {
        return categoryService.getCategoryById(id);
    }

    @PostMapping("/categories")
    public int addCategory(@RequestBody Category newCategory) {
        return categoryService.addCategory(newCategory);
    }

//    @GetMapping("/por/{id}")
//    public String getCategoryName(@PathVariable int id){
//        return  categoryService.getCategoryName(id);
//    }
}
