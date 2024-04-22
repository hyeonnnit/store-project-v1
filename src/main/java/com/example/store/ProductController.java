package com.example.store;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class ProductController {
    private final ProductService productService;


    @GetMapping("/product")
    public String list() {
        return "product/list";
    }

    @GetMapping("/product/{id}")
    public String detail() {
        return "product/detail";
    }

    @GetMapping("/product/save-form")
    public String saveForm() {
        return "product/save-form";
    }

    @PostMapping("/product/save")
    public String save() {
        return "redirect:/product";
    }

    @GetMapping("/product/{id}/update-form")
    public String updateForm() {
        return "product/update-form";
    }
    @PostMapping("/product/{id}/update")
    public String update() {
        return "redirect:/product/" + 1;
    }

    @PostMapping("/product/{id}/delete")
    public String delete() {
        return "redirect:/product";
    }
}